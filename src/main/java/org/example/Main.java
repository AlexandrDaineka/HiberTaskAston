package org.example;

import org.example.entity.Company;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        Company company = new Company();
        company.setId(1);
        company.setName("Aktoon");

        session.save(company);

        session.getTransaction().commit();

        session.close();
        HibernateUtil.stop();
    }
}