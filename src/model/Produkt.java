package model;

import java.sql.Timestamp;

public abstract class Produkt {

    private long oid;
    private String interneBezeichnung;
    private Timestamp eroeffnungsDatum;
    private Timestamp ablaufDatum;

    private Kunde besitzer;
}
