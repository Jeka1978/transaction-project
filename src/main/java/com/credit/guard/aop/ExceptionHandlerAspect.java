package com.credit.guard.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class ExceptionHandlerAspect {

    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping))")
    public String handleFormatExcettion(ProceedingJoinPoint pjp) {
        try {
            return (String) pjp.proceed();
        } catch (Throwable throwable) {
            return throwable.getMessage();
        }
    }
}
