package model;

import jakarta.persistence.Entity;

@Entity
public class Bausparvertrag extends Produkt {

    private double monatlicheRate;
    private double praemie;
    private int gesamtlaufZeitInMonaten;
    private float garantierterZinsSatz;

    public Bausparvertrag() {
    }

    public double getMonatlicheRate() {
        return monatlicheRate;
    }

    public void setMonatlicheRate(double monatlicheRate) {
        this.monatlicheRate = monatlicheRate;
    }

    public double getPraemie() {
        return praemie;
    }

    public void setPraemie(double praemie) {
        this.praemie = praemie;
    }

    public int getGesamtlaufZeitInMonaten() {
        return gesamtlaufZeitInMonaten;
    }

    public void setGesamtlaufZeitInMonaten(int gesamtlaufZeitInMonaten) {
        this.gesamtlaufZeitInMonaten = gesamtlaufZeitInMonaten;
    }

    public float getGarantierterZinsSatz() {
        return garantierterZinsSatz;
    }

    public void setGarantierterZinsSatz(float garantierterZinsSatz) {
        this.garantierterZinsSatz = garantierterZinsSatz;
    }
}
