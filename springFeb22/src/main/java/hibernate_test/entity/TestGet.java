package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSave {
  public static void main(String[] args) {
    SessionFactory factory =
        new Configuration()
            .configure("hibernate.cfg" + ".xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    Session session = factory.getCurrentSession();
    try {
      Employee emp = new Employee("Fedor", "Alexandrov", "HR", 200);
      session.beginTransaction();
      session.save(emp);
      session.getTransaction().commit();
    } finally {
      factory.close();
    }
  }
}
