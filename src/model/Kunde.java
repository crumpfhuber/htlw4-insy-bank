package model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    private Date beginnDerGeschäftsBeziehung;

    private String klassifizierung;

    @ManyToMany(mappedBy = "bewohner", fetch = FetchType.EAGER)
    private List<Adresse> adressen = new ArrayList<>();

    @OneToMany(mappedBy = "kunde", fetch = FetchType.LAZY)
    private List<Besuch> besuche = new ArrayList<>();

    @OneToMany(mappedBy = "besitzer", fetch = FetchType.LAZY)
    private List<Produkt> produkte = new ArrayList<>();

    public Kunde() {
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Date getBeginnDerGeschäftsBeziehung() {
        return beginnDerGeschäftsBeziehung;
    }

    public void setBeginnDerGeschäftsBeziehung(Date beginnDerGeschäftsBeziehung) {
        this.beginnDerGeschäftsBeziehung = beginnDerGeschäftsBeziehung;
    }

    public String getKlassifizierung() {
        return klassifizierung;
    }

    public void setKlassifizierung(String klassifizierung) {
        this.klassifizierung = klassifizierung;
    }

    public List<Adresse> getAdressen() {
        return adressen;
    }

    public void setAdressen(List<Adresse> adressen) {
        this.adressen = adressen;
    }

    public List<Besuch> getBesuche() {
        return besuche;
    }

    public void setBesuche(List<Besuch> besuche) {
        this.besuche = besuche;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
