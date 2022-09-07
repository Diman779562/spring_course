package spring_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* spring_aop.UniLibrary.get*())")
    private void allGetMethodsFromUnilibrary(){
    }

    @Pointcut("execution(* spring_aop.UniLibrary.return*())")
    private void allReturnMethodsFromUnilibrary(){
    }

    @Pointcut("allGetMethodsFromUnilibrary() || allReturnMethodsFromUnilibrary()")
    private void  allGetAndReturnMethodsFromLibrary() {
    }

    @Pointcut("execution(* spring_aop.UniLibrary.*(..))")
    private void allMethodsFromUnilibrary(){
    }

    @Pointcut("execution(public void spring_aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){
    }

    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUnilabrary() {
    }



    @Before("allGetMethodsFromUnilibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUnilibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }

    @Before("allMethodsExceptReturnMagazineFromUnilabrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
    }

}
