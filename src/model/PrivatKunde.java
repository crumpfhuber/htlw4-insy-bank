package model;

import jakarta.persistence.Entity;

import java.sql.Date;

@Entity
public class PrivatKunde extends Kunde {

    private String vorName;
    private String familienName;
    private Date geburtsDatum;
    private String geburtsOrt;

    public PrivatKunde() {
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getFamilienName() {
        return familienName;
    }

    public void setFamilienName(String familienName) {
        this.familienName = familienName;
    }

    public Date getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Date geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getGeburtsOrt() {
        return geburtsOrt;
    }

    public void setGeburtsOrt(String geburtsOrt) {
        this.geburtsOrt = geburtsOrt;
    }
}
