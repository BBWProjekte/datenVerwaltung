/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import java.sql.SQLException;

import sql.UserDAO;
import view.LoginGUI;
import view.Uebersicht;

/**
 *
 * @author 5ia13rimanavalan
 */

public class Login {

    private UserDAO user;
    private String name;
    private String pwd;
    private String errorMessage;
    private boolean isLogged = false;
    private LoginGUI logingui;
    private Uebersicht uebrsicht;
    

    public Uebersicht doLogin() throws ClassNotFoundException, SQLException {
   
        if (user.loginUser(name, pwd) == false) {
            errorMessage = "Username existiert nicht, bitte registrieren.";
            name = "";
            return null;
        } else {
            errorMessage = "";
            isLogged = true;
            return uebrsicht;
        }
    }

    public String logOut() {
        isLogged = false;
        return null;
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
     * @return the password
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param password the password to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
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
     * @return the isLogged
     */
    public boolean isIsLogged() {
        return isLogged;
    }
}
