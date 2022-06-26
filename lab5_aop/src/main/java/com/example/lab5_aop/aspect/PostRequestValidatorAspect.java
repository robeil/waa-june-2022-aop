package com.example.lab5_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class PostRequestValidatorAspect {

    private HttpServletRequest httpServletRequest;

    PostRequestValidatorAspect(HttpServletRequest httpServletRequest){
        this.httpServletRequest = httpServletRequest;
    }

    @Pointcut(value  ="execution(* com.example.lab5_aop.service..*(..))")
    public void getPointCut() {
    }

    @Around("getPointCut()")
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        if(httpServletRequest.getMethod().equals("POST") && httpServletRequest.getHeader("AOP-IS-AWESOME")==null){
            throw new AopException("Header is required");
        }
        return jp.proceed();
    }
}
