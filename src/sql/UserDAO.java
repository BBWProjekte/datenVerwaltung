/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rinoy Manavalan
 */
public class UserDAO {

    Connection conn = null;

    public UserDAO() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");

    }

    private void createDatabase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS  datenverwaltung;");
            System.out.println("Database created !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTable() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datenverwaltung", "root", "");
            Statement stat = conn.createStatement();
            stat.execute("use datenverwaltung;");
            stat.execute("create table IF NOT EXISTS user(username varchar(50), name varchar(255), vorname varchar(50),jahrenachdergeburt int(100), adresse varchar(255),pwd varchar(255));");
            System.out.println("Table User wurde erstellt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean registerUser(String username, String name, String vorname, int jahrenachdergeburt, String adresse, String password) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datenverwaltung", "root", "");

            Statement stmt = conn.createStatement();

            String doesUserExist = "select username from user;";
            String strSql = "INSERT INTO user(username, name, vorname, jahrenachdergeburt, adresse ,pwd) VALUES ('" + username + "','" + name + "','" + vorname + "','" + jahrenachdergeburt + "','" + adresse + "','" + password + "');";

            ResultSet set = stmt.executeQuery(doesUserExist);

            while (set.next()) {
                if (username.equals(set.getString("username"))) {
                    return false;
                }
            }

            stmt.executeUpdate(strSql);

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public void getUserInfos(String username, String name, String vorname, String adresse, int alter, String passwort)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datenverwaltung", "root", "");

            Statement stmt = conn.createStatement();

        username = ("select username from user;");
        
        
        
        
    }

    public boolean loginUser(String login, String password) throws ClassNotFoundException, SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datenverwaltung", "root", "");

            Statement stmt = conn.createStatement();

            String doesUserExist = "select * from user;";

            ResultSet set = stmt.executeQuery(doesUserExist);

            while (set.next()) {
                if (login.equals(set.getString("username")) && password.equals(set.getString("pwd"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
