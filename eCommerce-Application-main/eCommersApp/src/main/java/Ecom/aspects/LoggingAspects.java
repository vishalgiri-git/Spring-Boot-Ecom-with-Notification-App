package Ecom.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
    public static final Logger logger = LoggerFactory.getLogger("LoggingAspect.class");

    @Around("execution(* Ecom.ServiceImpl.ProductServiceImpl.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime =System.currentTimeMillis();
        logger.info("Before method execution: {}", joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        logger.info("After method execution: {}", joinPoint.getSignature().getName());
        long endTime = System.currentTimeMillis();
        logger.info("time taken: {}",endTime-startTime);
        return result;
    }

   /* @Before("execution(* Ecom.ServiceImpl.ProductServiceImpl.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint){
        logger.info("before method execution {} ", joinPoint.getSignature().getName());
    }*/

    // @Before => before method execution
    // @After => after method execution
    // @AfterReturning => after returning result
    // @AfterThrowing => after throwing exception
    // @Around  => Before and After

/*    @After("execution(* Ecom.ServiceImpl.ProductServiceImpl.getSingleProduct(..))")
    public void logAfterMethod(){
        logger.info("after method execution");
    }*/
}
