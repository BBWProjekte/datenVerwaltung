/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import gui.LoginGUI;
import java.sql.SQLException;
import sql.UserDAO;

/**
 *
 * @author 5ia13meislami
 */


public class Login {
    private UserDAO user;
    private LoginGUI test = new LoginGUI();

    private String name;
    private String password;
    private String errorMessage;
    private boolean isLogged = false;

    public LoginGUI doLogin() throws ClassNotFoundException, SQLException {

        if (user.loginUser(name, password) == false) {
            errorMessage = "Username existiert nicht, bitte registrieren.";
            name = "";
            return test;
        } else {
            errorMessage = "";
            isLogged = true;
            return test;
        }
    }

    public String logOut() {
        isLogged = false;
        return "index.xhtml";
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
