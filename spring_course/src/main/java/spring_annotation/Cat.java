package spring_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
@Scope("singleton")
public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Мяу мяу");
    }

    @PostConstruct
    protected void init() {
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
