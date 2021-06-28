package model;

import jakarta.persistence.Entity;

import java.sql.Date;

@Entity
public class FirmenKunde extends Kunde {

    private String firmenLangBezeichnung;
    private String firmenKürzel;
    private Date gruendungsDatum;
    private String gruendungsOrt;
    private String gesellschaftsForm;

    public FirmenKunde() {
    }

    public String getFirmenLangBezeichnung() {
        return firmenLangBezeichnung;
    }

    public void setFirmenLangBezeichnung(String firmenLangBezeichnung) {
        this.firmenLangBezeichnung = firmenLangBezeichnung;
    }

    public String getFirmenKürzel() {
        return firmenKürzel;
    }

    public void setFirmenKürzel(String firmenKürzel) {
        this.firmenKürzel = firmenKürzel;
    }

    public Date getGruendungsDatum() {
        return gruendungsDatum;
    }

    public void setGruendungsDatum(Date gruendungsDatum) {
        this.gruendungsDatum = gruendungsDatum;
    }

    public String getGruendungsOrt() {
        return gruendungsOrt;
    }

    public void setGruendungsOrt(String gruendungsOrt) {
        this.gruendungsOrt = gruendungsOrt;
    }

    public String getGesellschaftsForm() {
        return gesellschaftsForm;
    }

    public void setGesellschaftsForm(String gesellschaftsForm) {
        this.gesellschaftsForm = gesellschaftsForm;
    }
}
