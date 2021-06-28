package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    private boolean isZustellAdresse;
    private String strasse;
    private String hausNummer;
    private int postLeitZahl;
    private String ort;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "KUNDE_ADRESSE",
            joinColumns = {@JoinColumn (name = "KundeOID")},
            inverseJoinColumns =  {@JoinColumn(name = "AdresseOID")}
    )
    private List<Kunde> bewohner = new ArrayList<>();

    public Adresse() {
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public boolean isZustellAdresse() {
        return isZustellAdresse;
    }

    public void setZustellAdresse(boolean zustellAdresse) {
        isZustellAdresse = zustellAdresse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNummer() {
        return hausNummer;
    }

    public void setHausNummer(String hausNummer) {
        this.hausNummer = hausNummer;
    }

    public int getPostLeitZahl() {
        return postLeitZahl;
    }

    public void setPostLeitZahl(int postLeitZahl) {
        this.postLeitZahl = postLeitZahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public List<Kunde> getBewohner() {
        return bewohner;
    }

    public void setBewohner(List<Kunde> bewohner) {
        this.bewohner = bewohner;
    }
}
