package spring_java_code_1;


import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
