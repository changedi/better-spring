package com.cloudex.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zunyuan.jy on 16/10/20.
 */
@Aspect
public class TestAspect {

    /**
     * introduction.
     */
    @DeclareParents(value = "com.cloudex.spring.aop.*+", defaultImpl = TestInterfaceImpl.class)
    public static TestInterface mixin;

    /**
     * pointcut
     */
    @Pointcut("execution(* com.cloudex.spring.aop.*.sayHello(..))")
    public void businessService() {
    }
//
//    @Pointcut("")
//    public void returnService(){}


    /**
     * advices.
     */

    @Before("businessService() && args(n,..)")
    public void doBefore(String n) {
        System.out.println("here @Before sayHello(). " + n);
    }

    @Before("execution(* com.cloudex.spring.aop.*.sayBye(..))")
    public void doAccessCheck() {
        System.out.println("here @Before sayBye.");
    }

    @AfterReturning("execution(* com.cloudex.spring.aop.*.sayBye(..))")
    public void doAfterReturning() {
        System.out.println("here @AfterReturning sayBye.");
    }

    @AfterReturning(pointcut = "execution(* com.cloudex.spring.aop.*.ret1(..))", returning = "retVal")
    public void doAfterReturn(Object retVal) {
        System.out.println("here @AfterReturn ret1. with retVal:" + retVal);
    }

    @AfterThrowing(pointcut = "execution(* com.cloudex.spring.aop.*.exception(..))",
            throwing = "ex")
    public void doAfterException(Exception ex) {
        System.out.println("here @AfterThrowing exception. " + ex);
    }

    @After("execution(* com.cloudex.spring.aop.*.exception(..))")
    public void doAfterFinally() {
        System.out.println("here @AfterFinally exception. ");
    }

    @Around("execution(* com.cloudex.spring.aop.*.around(..))")
    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("here @Around start.");
        System.out.println(pjp.getClass());
        System.out.println(pjp.getArgs().length);
        System.out.println(pjp.getKind());
        System.out.println(pjp.getSignature());
        System.out.println(pjp.getThis());
        System.out.println(pjp.getTarget());
        System.out.println(pjp.getSourceLocation());
        System.out.println(pjp.getStaticPart());
        Object retVal = pjp.proceed();
        System.out.println("here @Around end.");
    }

    @Around("execution(* with*(..)) && @annotation(annotation)")
    public void doAroundAnnotation(ProceedingJoinPoint pjp, TestAnnotation annotation) throws Throwable {
        System.out.println("here around @Annotation. " + annotation.value() + ":" + annotation.key());
        pjp.proceed();
    }

    @Before("businessService() && this(testInterface)")
    public void doInterface(TestInterface testInterface) {
        testInterface.doPrint("Lily");
    }


}
