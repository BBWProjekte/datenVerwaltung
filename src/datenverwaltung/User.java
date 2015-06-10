/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import java.sql.SQLException;

import sql.UserDAO;

/**
 *
 * @author Rinoy Manavalan
 */
public class User {

    private UserDAO user;
    private String username;
    private String name;
    private String vorname;
    private int jahrenachdergeburt;
    private String adresse;
    private String password;
    private String errorMessage;

    public User() throws ClassNotFoundException, SQLException {
        user = new UserDAO();
    }

    public void doRegister(String username, String name, String vorname, String alter, String adresse, String password) throws ClassNotFoundException, SQLException {
        jahrenachdergeburt = Integer.parseInt(alter);
        username = username;
        name = this.name;
        vorname = this.vorname;
        adresse = this.adresse;
        password = this.password;

        if (user.registerUser(username, name, vorname, jahrenachdergeburt, adresse, password) == false) {
            errorMessage = "Der Username ist schon vergeben.";
            username = "";
        } else {
            username = "";
            errorMessage = "";
        }
    }

    /**
     * @return the userid
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param userid the userid to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the user
     */
    public UserDAO getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserDAO user) {
        this.user = user;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname the vorname to set
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return the jahrenachdergeburt
     */
    public int getJahrenachdergeburt() {
        return jahrenachdergeburt;
    }

    /**
     * @param jahrenachdergeburt the jahrenachdergeburt to set
     */
    public void setJahrenachdergeburt(int jahrenachdergeburt) {
        this.jahrenachdergeburt = jahrenachdergeburt;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
