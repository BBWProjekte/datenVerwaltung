/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import java.sql.SQLException;

import sql.UserDAO;
import view.LoginGUI;
import view.UebersichtGUI;

/**
 *
 * @author Rinoy Manavalan
 */
public class Login {

    private UserDAO user;
    private String name;
    private String pwd;
    private String errorMessage;
    private boolean isLogged = false;
    private LoginGUI logingui;
    private UebersichtGUI uebrsicht;

    public Login() throws ClassNotFoundException, SQLException {

        user = new UserDAO();
    }

    public boolean doLogin(String username, String pwd) throws ClassNotFoundException, SQLException {

        if (user.loginUser(username, pwd) == false) {
            errorMessage = "Username existiert nicht, bitte registrieren.";
            name = "";
            return false;
        } else {
            errorMessage = "";
            isLogged = true;
            return true;
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
