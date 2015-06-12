/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenverwaltung;

import java.sql.SQLException;
import view.LoginGUI;
import view.RegisterGUI;
import javax.swing.JFrame;

/**
 *
 * @author Rinoy Manavalan
 */
public class DatenVerwaltung {

    private LoginGUI lg;

    /**
     * Main-Methode: LoginGUI wird aufgerufen, - grösse und position wird
     * definiert - wird ersichtlich gemacht - GUI-Fenster kann man nicht
     * grösser/kleiner machen
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        LoginGUI login = new LoginGUI();

        login.setTitle("Login");
        login.setVisible(true);
        login.setBounds(500, 500, 400, 250);
        login.setResizable(false);
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
