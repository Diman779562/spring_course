package spring_aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Берем книгу из SchoolLibrary");
    }


    public void getMagazine() {
        System.out.println("Берем журнал из SchoolLibrary");
    }
}
