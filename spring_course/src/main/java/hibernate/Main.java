package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Surkov", "HR", 1000);
            session.beginTransaction();
            session.save(emp);


            int myID = emp.getId();
            Employee employee = session.get(Employee.class, myID);
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
