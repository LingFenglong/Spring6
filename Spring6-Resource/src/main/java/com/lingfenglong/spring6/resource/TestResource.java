package com.lingfenglong.spring6.resource;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestResource {
    @Test
    public void testUrlResourceHttp() throws IOException {
        UrlResource resource = new UrlResource("http://www.baidu.com");

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @Test
    public void testUrlResourceFile() throws IOException {
        UrlResource resource = new UrlResource("file:D:\\git\\Spring-Learning\\Spring6\\Spring6-Resource\\src\\main\\java\\com\\lingfenglong\\spring6\\resourcedemo\\file.txt");

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @Test
    public void testClassPathResource() throws IOException {
        ClassPathResource resource = new ClassPathResource("resourceFile.txt");

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @Test
    public void testFileSystemResource() throws Exception {
        FileSystemResource resource = new FileSystemResource("D:\\git\\Spring-Learning\\Spring6\\Spring6-Resource\\src\\main\\resources\\resourceFile.txt");

        System.out.println(resource.getURL());
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        System.out.println(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}
