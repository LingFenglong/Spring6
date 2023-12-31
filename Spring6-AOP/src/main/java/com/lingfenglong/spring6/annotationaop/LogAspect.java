package com.lingfenglong.spring6.annotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    // 设置切入点 和 通知类型
    /*
        @Before()
        @AfterReturning
        @AfterThrowing
        @After()
        @Around()
     */

    @Before("pointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Logger 前置通知  " + joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
    }

    @After("com.lingfenglong.spring6.annotationaop.LogAspect.pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("Logger 后置通知  " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.lingfenglong.spring6.annotationaop.CalculatorImpl.*(..))", returning = "res")
    public void afterReturningMethod(JoinPoint joinPoint, Object res) {
        System.out.println("Logger 返回通知  " + joinPoint.getSignature().getName() + " " + "returned => " + res);
    }

    @AfterThrowing(value = "execution(* com.lingfenglong.spring6.annotationaop.CalculatorImpl.*(..))", throwing = "throwable")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable throwable) {
        System.out.println("Logger 异常通知  " + joinPoint.getSignature().getName() + " " + "throws => " + throwable);
    }

    @Around("execution(* com.lingfenglong.spring6.annotationaop.CalculatorImpl.*(..))")
    public Object afterAroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object res = null;
        try {
            System.out.println("Around 目标方法执行前执行");
            res = proceedingJoinPoint.proceed();
            System.out.println("Around 目标方法执行后执行");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Around 目标方法发生异常后执行");
        } finally {
            System.out.println("Around 目标方法执行完成");
        }
        return res;
    }

    // 重用切入点表达式
    @Pointcut("execution(public int com.lingfenglong.spring6.annotationaop.CalculatorImpl.*(int, int))")
    public void pointcut() {}
}
