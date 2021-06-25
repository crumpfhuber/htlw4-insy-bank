package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "bank_MySQL";
    private static EntityManagerFactory factory;
    private static EntityManager manager;

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("-> Initialisierung");
        System.out.println("******************************");

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        manager = factory.createEntityManager();

        test();
    }

    private static void test() {
        System.out.println("******************************");
        System.out.println("-> Objekt-Katastrophe");
        System.out.println("******************************");


    }
}
