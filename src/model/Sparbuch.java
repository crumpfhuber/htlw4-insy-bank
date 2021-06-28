package model;

import jakarta.persistence.Entity;

@Entity
public class Sparbuch extends Produkt {

    private float zinsSatz;
    private double aktuellerSparSaldo;
    private int sperrdauerInMonaten;

    public Sparbuch() {
    }

    public float getZinsSatz() {
        return zinsSatz;
    }

    public void setZinsSatz(float zinsSatz) {
        this.zinsSatz = zinsSatz;
    }

    public double getAktuellerSparSaldo() {
        return aktuellerSparSaldo;
    }

    public void setAktuellerSparSaldo(double aktuellerSparSaldo) {
        this.aktuellerSparSaldo = aktuellerSparSaldo;
    }

    public int getSperrdauerInMonaten() {
        return sperrdauerInMonaten;
    }

    public void setSperrdauerInMonaten(int sperrdauerInMonaten) {
        this.sperrdauerInMonaten = sperrdauerInMonaten;
    }
}
