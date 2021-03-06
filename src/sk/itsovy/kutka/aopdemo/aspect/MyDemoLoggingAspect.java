package sk.itsovy.kutka.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {


//    @Before("execution(public void add*())")

    @Before("execution(* sk.itsovy.kutka.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("ASPECT @BEFORE");
    }
}
