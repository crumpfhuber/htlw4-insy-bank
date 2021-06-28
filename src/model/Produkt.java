package model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    @ManyToOne
    @JoinColumn(name = "besitzerOID", nullable = false)
    private Kunde besitzer;

    private String interneBezeichnung;
    private Date eroeffnungsDatum;
    private Date ablaufDatum;

    public Produkt() {
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Kunde getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Kunde besitzer) {
        this.besitzer = besitzer;
    }

    public String getInterneBezeichnung() {
        return interneBezeichnung;
    }

    public void setInterneBezeichnung(String interneBezeichnung) {
        this.interneBezeichnung = interneBezeichnung;
    }

    public Date getEroeffnungsDatum() {
        return eroeffnungsDatum;
    }

    public void setEroeffnungsDatum(Date eroeffnungsDatum) {
        this.eroeffnungsDatum = eroeffnungsDatum;
    }

    public Date getAblaufDatum() {
        return ablaufDatum;
    }

    public void setAblaufDatum(Date ablaufDatum) {
        this.ablaufDatum = ablaufDatum;
    }
}
