package spring_java_code_2;


import org.springframework.context.annotation.*;
import spring_java_code_1.Cat;
import spring_java_code_1.Pet;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
