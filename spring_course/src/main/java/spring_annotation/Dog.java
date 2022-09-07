package spring_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }

    @PostConstruct
    protected void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
