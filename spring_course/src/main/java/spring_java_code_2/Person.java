package spring_java_code_2;


import org.springframework.beans.factory.annotation.Value;

public class Person {

    private spring_java_code_2.Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мой любимый питомец!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
