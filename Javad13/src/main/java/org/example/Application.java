package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final String persistenceUnitName = "JavaD12";
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");

        //  chiudi l'EntityManager
        em.close();
    }
}
