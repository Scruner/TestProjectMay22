package ru.vdv.springdataapril22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.vdv.springdataapril22.entity.Person;
import ru.vdv.springdataapril22.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringdataApril22Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApril22Application.class, args);
    }

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Override
    public void run(String... args) throws Exception {
        Person anna = new Person(100, "Anna", "Andreeva", "Samara");
        Person olesya = new Person(101, "Olesya", "Ivanova", "Moscow");
        Person lex = new Person(102, "Lex", "Luter", "Omsk");

        personJdbcDao.insert(anna);
        personJdbcDao.insert(olesya);
        personJdbcDao.insert(lex);

        System.out.println("<<<<<<<<<" + personJdbcDao.findAll() +
                ">>>>>>>>>>");
    }
}
