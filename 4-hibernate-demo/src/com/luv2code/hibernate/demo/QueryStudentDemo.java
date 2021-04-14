package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            // query students
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            // display the students
            displayStudents(theStudents);

            // query students: lastName = 'Doe'
            theStudents = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();

            // display students
            System.out.println("\nStudents who has last name of Doe");
            displayStudents(theStudents);

            // query students: lastName = 'Doe' OR firstName = 'Daffy';
            theStudents = session.createQuery("from Student s where s.lastName = 'Doe' OR s.firstName = 'Daffy'").getResultList();

            // display students
            System.out.println("\nStudents who has last name of Doe or first name of Daffy");
            displayStudents(theStudents);

            // query students: email ends with outlook.com
            theStudents = session.createQuery("from Student s where s.email LIKE '%outlook.com'").getResultList();

            // display students
            System.out.println("\nStudents whose emails ends with outlook.com");
            displayStudents(theStudents);

            // commit the transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudents) {
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }
}
