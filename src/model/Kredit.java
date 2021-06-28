package model;

import jakarta.persistence.Entity;

@Entity
public class Kredit extends Produkt {

    private double basisKreditBetrag;
    private double aktuellerSaldo;
    private float aktuellerZinsSatz;
    private int ausstehendeTilgungen;

    public Kredit() {
    }

    public double getBasisKreditBetrag() {
        return basisKreditBetrag;
    }

    public void setBasisKreditBetrag(double basisKreditBetrag) {
        this.basisKreditBetrag = basisKreditBetrag;
    }

    public double getAktuellerSaldo() {
        return aktuellerSaldo;
    }

    public void setAktuellerSaldo(double aktuellerSaldo) {
        this.aktuellerSaldo = aktuellerSaldo;
    }

    public float getAktuellerZinsSatz() {
        return aktuellerZinsSatz;
    }

    public void setAktuellerZinsSatz(float aktuellerZinsSatz) {
        this.aktuellerZinsSatz = aktuellerZinsSatz;
    }

    public int getAusstehendeTilgungen() {
        return ausstehendeTilgungen;
    }

    public void setAusstehendeTilgungen(int ausstehendeTilgungen) {
        this.ausstehendeTilgungen = ausstehendeTilgungen;
    }
}
