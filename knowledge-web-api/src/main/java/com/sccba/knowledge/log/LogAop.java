package com.sccba.knowledge.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hello on 2019/12/24.
 */
@Aspect
@Component
public class LogAop {
    private static final Logger logger = LoggerFactory.getLogger(LogAop.class);

    @Pointcut(value = "execution(* com.sccba.knowledge.controller.*.*(..))")
    private void pointCut(){}

    @Before(value = "pointCut()")
    public void logBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        int length = args.length;

        logger.debug("请求的方法名为：{}",name);
        logger.debug("请求的入参的个数为：{}",length);
        logger.debug("请求的入参为：{}",args);
    }

    @AfterReturning(value = "pointCut()",returning = "obj")
    public void afterReturn(JoinPoint joinPoint,Object obj) {

        logger.debug("请求的方法名为：{}",joinPoint.getSignature().getName());
        logger.debug("请求的结果为：{}",obj);
    }
}


