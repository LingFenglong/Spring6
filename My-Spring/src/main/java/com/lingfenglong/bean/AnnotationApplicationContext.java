package com.lingfenglong.bean;

import com.lingfenglong.annotation.Bean;
import com.lingfenglong.annotation.Di;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnnotationApplicationContext implements ApplicationContext {
    private String rootPath;
    private Map<Class, Object> beanFactory = new HashMap<>();

    @Override
    public <T> T getBean(Class cls) {
        return (T) beanFactory.get(cls);
    }

    public AnnotationApplicationContext(String basePackage) {
        try {
            String packagePath = basePackage.replaceAll("\\.", "/");
            Thread.currentThread()
                    .getContextClassLoader()
                    .getResources(packagePath)
                    .asIterator()
                    .forEachRemaining(fileUrl -> {
                        String path = fileUrl.getFile();
                        rootPath = path.substring(0, path.length() - packagePath.length());
                        loadFile(new File(path));
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        loadDi();
    }

    private void loadFile(File file) {
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                loadFile(listFile);
            }
        } else if (file.isFile()) {
            String path = file.getPath();
            if (path.contains(".class")) {
                String classPath = path.substring(rootPath.length() - 1, path.length() - 6)
                        .replaceAll("\\\\", ".");
                // classPath  --->  com.lingfenglong.bean.AnnotationApplicationContext
                loadBean(classPath);
            }
        }
    }

    private void loadBean(String classPath) {
        Class<?> cls;
        try {
            cls = Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 判断是否为接口                 是否被@Bean修饰
        if (!cls.isAnnotation() && cls.getAnnotation(Bean.class) != null) {
            try {
                Object obj = cls.getConstructor().newInstance();

                // 是否有超类接口？
                if (cls.getInterfaces().length > 0) {
                    beanFactory.put(cls.getInterfaces()[0], obj);
                } else {
                    beanFactory.put(cls, obj);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void loadDi() {
        beanFactory.forEach((k, v) -> {
            Arrays.stream(v.getClass().getDeclaredFields())
                    .filter(field -> field.getAnnotation(Di.class) != null)
                    .forEach(field -> {
                        try {
                            field.setAccessible(true);
                            field.set(v, beanFactory.get(field.getType()));
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    });
        });
        beanFactory.forEach((k, v) -> System.out.println(k + "  " + v.toString()));
    }

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.lingfenglong");
        context.beanFactory.forEach((k, v) -> System.out.println(k + "  " + v));
    }
}
