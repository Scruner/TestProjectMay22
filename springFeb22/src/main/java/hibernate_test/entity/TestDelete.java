package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestUpdate {
  public static void main(String[] args) {
    SessionFactory factory =
        new Configuration()
            .configure("hibernate.cfg" + ".xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();
    try {
      Session session = factory.getCurrentSession();
      session.beginTransaction();
      session.createQuery("update Employee set salary = 730 where name = " +
              "'Lena' ").executeUpdate();
      //      Employee emp2 = session.get(Employee.class, 3);
      //      emp2.setSalary(400);

      session.getTransaction().commit();
      System.out.println("Done!!!");

    } finally {
      factory.close();
    }
  }
}
