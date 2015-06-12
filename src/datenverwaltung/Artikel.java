/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import java.sql.SQLException;
import sql.ArtikelDAO;

import sql.UserDAO;

/**
 *
 * @author Rinoy Manavalan
 */
public class Artikel {

    private ArtikelDAO artikeldao;
    private String artikelname;
    private int artikelnr;
    private int vorhandeneStk;
    private int preis;
    private String errorMessage;

    public Artikel() throws ClassNotFoundException, SQLException {
        artikeldao = new ArtikelDAO();
    }

    public boolean newArtikel(String artikelname, int artikelnr, int vorhandeneStk, int preis) throws ClassNotFoundException, SQLException {

        if (getArtikeldao().newArtikel(artikelname, artikelnr, vorhandeneStk, preis) == false) {
            errorMessage = "Diser Artikel existiert bereits.";
            artikelname = "";
            return false;
        } else {
            artikelname = "";
            errorMessage = "";
            return true;
        }
    }

    /**
     * @return the artikeldao
     */
    public ArtikelDAO getArtikeldao() {
        return artikeldao;
    }

    /**
     * @param artikeldao the artikeldao to set
     */
    public void setArtikeldao(ArtikelDAO artikeldao) {
        this.artikeldao = artikeldao;
    }

    /**
     * @return the artikelname
     */
    public String getArtikelname() {
        return artikelname;
    }

    /**
     * @param artikelname the artikelname to set
     */
    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    /**
     * @return the artikelnr
     */
    public int getArtikelnr() {
        return artikelnr;
    }

    /**
     * @param artikelnr the artikelnr to set
     */
    public void setArtikelnr(int artikelnr) {
        this.artikelnr = artikelnr;
    }

    /**
     * @return the vorhandeneStk
     */
    public int getVorhandeneStk() {
        return vorhandeneStk;
    }

    /**
     * @param vorhandeneStk the vorhandeneStk to set
     */
    public void setVorhandeneStk(int vorhandeneStk) {
        this.vorhandeneStk = vorhandeneStk;
    }

    /**
     * @return the preis
     */
    public int getPreis() {
        return preis;
    }

    /**
     * @param preis the preis to set
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

}
