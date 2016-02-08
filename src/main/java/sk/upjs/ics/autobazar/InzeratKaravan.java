/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Patrik
 */
public class InzeratKaravan {

    private Long idP;

    private Long id;

    private String znacka;

    private String model;

    private String rocnik;

    private Long objem;

    private Long km;

    public String prevodovka;

    public Long vykon;

    private Date datumPridania;

    private Long cena;

    private String typ;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    private boolean hmotnost;

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRocnik() {
        return rocnik;
    }

    public void setRocnik(String rocnik) {
        this.rocnik = rocnik;
    }

    public Long getObjem() {
        return objem;
    }

    public void setObjem(Long objem) {
        this.objem = objem;
    }

    public Long getKm() {
        return km;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public String getPrevodovka() {
        return prevodovka;
    }

    public void setPrevodovka(String prevodovka) {
        this.prevodovka = prevodovka;
    }

    public Long getVykon() {
        return vykon;
    }

    public void setVykon(Long vykon) {
        this.vykon = vykon;
    }

    public Date getDatumPridania() {
        return datumPridania;
    }

    public void setDatumPridania(Date datumPridania) {
        this.datumPridania = datumPridania;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    public boolean isHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(boolean hmotnost) {
        this.hmotnost = hmotnost;
    }

    @Override
    public String toString() {
        return this.znacka + " " + this.model + ", Rok vyroby: " + this.rocnik + ", Objem: " + this.objem + "\n\n";
    }

    public String toString2() {
        if (this.isHmotnost()) {
            return "Znacka: " + this.znacka + "\n"
                    + "Model: " + this.model + "\n"
                    + "Rok vyroby: " + this.rocnik + "\n"
                    + "Objem: " + this.objem + "\n"
                    + "Vykon: " + this.vykon + " KW\n"
                    + "Pocet najazdenych kilometrov: " + this.km + "\n"
                    + "Typ: " + this.getTyp() + "\n"
                    + "Prevodovka: " + this.getPrevodovka() + "\n"
                    + "Hmotnost: nad 3,5t";
        } else {
            return "Znacka: " + this.znacka + "\n"
                    + "Model: " + this.model + "\n"
                    + "Rok vyroby: " + this.rocnik + "\n"
                    + "Objem: " + this.objem + "\n"
                    + "Vykon: " + this.vykon + " KW\n"
                    + "Pocet najazdenych kilometrov: " + this.km + "\n"
                    + "Typ: " + this.getTyp() + "\n"
                    + "Prevodovka: " + this.getPrevodovka() + "\n"
                    + "Hmotnost: pod 3,5t";

        }
    }

}
