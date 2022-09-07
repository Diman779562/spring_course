package spring_XML;

public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }

    public void init(){
        System.out.println("Class Cat: init method");
    }

    public void destroy(){
        System.out.println("Class Cat: destroy method");
    }
}
