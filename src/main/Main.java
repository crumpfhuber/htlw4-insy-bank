package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.*;

import java.sql.Date;
import java.sql.Timestamp;

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

        System.out.println("a) Erstelle Adressen");

        Adresse thalheim = new Adresse();
        thalheim.setStrasse("Thalheim");
        thalheim.setHausNummer("100");
        thalheim.setOrt("Thalheim");
        thalheim.setPostLeitZahl(4600);

        Adresse edt = new Adresse();
        edt.setStrasse("Edt");
        edt.setHausNummer("1");
        edt.setOrt("Edt");
        edt.setPostLeitZahl(4650);

        Adresse wels = new Adresse();
        wels.setStrasse("Wels");
        wels.setHausNummer("10");
        wels.setOrt("Wels");
        wels.setPostLeitZahl(4600);

        System.out.println("2) Erstelle Kunden");

        PrivatKunde clemens = new PrivatKunde();
        clemens.getAdressen().add(thalheim);
        clemens.getAdressen().add(edt);
        clemens.setKlassifizierung("1a");

        PrivatKunde christoph = new PrivatKunde();
        christoph.getAdressen().add(edt);
        christoph.setKlassifizierung("1a");

        FirmenKunde htl = new FirmenKunde();
        htl.getAdressen().add(wels);
        htl.setBeginnDerGeschäftsBeziehung(Date.valueOf("2021-06-28"));
        htl.setKlassifizierung("1c");

        thalheim.getBewohner().add(clemens);
        edt.getBewohner().add(clemens);
        edt.getBewohner().add(christoph);
        wels.getBewohner().add(htl);

        System.out.println("3) Erstelle Besuche");

        Besuch kontoeroeffnung = new Besuch();
        kontoeroeffnung.setBeschreibung("Kontoeröffnung");
        kontoeroeffnung.setDatum(Timestamp.valueOf("2021-06-28 14:00:00"));
        kontoeroeffnung.setKunde(clemens);
        kontoeroeffnung.setBewertung(1);

        Besuch kontoschliessung = new Besuch();
        kontoschliessung.setBeschreibung("Kontoschließung");
        kontoschliessung.setDatum(Timestamp.valueOf("2021-06-28 15:30:00"));
        kontoschliessung.setKunde(christoph);
        kontoschliessung.setBewertung(1);

        clemens.getBesuche().add(kontoeroeffnung);
        christoph.getBesuche().add(kontoschliessung);

        System.out.println("4) Erstelle Produkte");

        Sparbuch sparbuch = new Sparbuch();
        sparbuch.setBesitzer(clemens);
        sparbuch.setEroeffnungsDatum(Date.valueOf("2021-06-28"));
        sparbuch.setAblaufDatum(Date.valueOf("2021-06-28"));
        sparbuch.setInterneBezeichnung("SPARBUCH 007");
        sparbuch.setAktuellerSparSaldo(2.0);
        sparbuch.setZinsSatz(3.4f);
        sparbuch.setSperrdauerInMonaten(12*5);

        Bausparvertrag bausparvertrag = new Bausparvertrag();
        bausparvertrag.setBesitzer(christoph);
        bausparvertrag.setEroeffnungsDatum(Date.valueOf("2021-06-28"));
        bausparvertrag.setInterneBezeichnung("Bausparer");
        bausparvertrag.setGarantierterZinsSatz(3.2f);
        bausparvertrag.setPraemie(3.0);
        bausparvertrag.setMonatlicheRate(1000.0);
        bausparvertrag.setGesamtlaufZeitInMonaten(12*5);

        Kredit kredit = new Kredit();
        kredit.setEroeffnungsDatum(Date.valueOf("2021-06-28"));
        kredit.setAblaufDatum(Date.valueOf("2026-06-28"));
        kredit.setBesitzer(htl);
        kredit.setInterneBezeichnung("KREDIT 1001");
        kredit.setAktuellerSaldo(2.9);
        kredit.setBasisKreditBetrag(100000.0);
        kredit.setAusstehendeTilgungen(30000);
        kredit.setAktuellerZinsSatz(0.9f);

        clemens.getProdukte().add(sparbuch);
        christoph.getProdukte().add(bausparvertrag);
        htl.getProdukte().add(kredit);




        System.out.println("******************************");
        System.out.println("-> Datenbank-Katastrophe");
        System.out.println("******************************");

        manager.getTransaction().begin();

        manager.persist(thalheim);
        manager.persist(edt);
        manager.persist(wels);

        manager.persist(clemens);
        manager.persist(christoph);
        manager.persist(htl);

        manager.persist(kontoeroeffnung);
        manager.persist(kontoschliessung);

        manager.persist(sparbuch);
        manager.persist(bausparvertrag);
        manager.persist(kredit);

        manager.getTransaction().commit();

        System.out.println("******************************");
        System.out.println("-> Katastrophe BEENDET. JUHUUUU");
        System.out.println("******************************");
    }
}
