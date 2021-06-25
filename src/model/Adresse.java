package model;

import java.util.ArrayList;

public class Adresse {

    private long oid;
    private boolean isZustellAdresse;
    private String strasse;
    private String hausNummer;
    private int postLeitZahl;
    private String ort;

    private ArrayList<Kunde> bewohner;

}
