package spring_java_code_1;


import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Мяу мяу");
    }
}
