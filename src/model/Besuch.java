package model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Besuch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    @ManyToOne
    @JoinColumn(name = "kundeOID", nullable = false)
    private Kunde kunde;

    private Timestamp datum;
    private String beschreibung;
    private int bewertung;

    public Besuch() {
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Timestamp getDatum() {
        return datum;
    }

    public void setDatum(Timestamp datum) {
        this.datum = datum;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }
}