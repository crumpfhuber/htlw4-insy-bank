package model;

import java.sql.Date;
import java.util.ArrayList;

public class Kunde {

    private long oid;
    private Date beginnDerGeschäftsBeziehung;
    private String klassifizierung;

    private Adresse adresse;

    private ArrayList<Besuch> besuche;

    private ArrayList<Produkt> produkte;

}
