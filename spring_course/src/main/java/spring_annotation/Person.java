package spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("singleton")
public class Person {

    private spring_annotation.Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = (spring_annotation.Pet) pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мой любимый питомец!");
        pet.say();
    }

    public String getSurname() {return surname;}

    public int getAge() {return age;}

}
