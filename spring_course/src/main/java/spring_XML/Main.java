package spring_XML;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext_XML.xml");


        spring_XML.Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println("Моя фамилия: " + person.getSurname());
        System.out.println("Мой возраст: " + person.getAge());



        context.close();


    }
}
