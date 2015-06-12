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
public class ArtikelDAO {

    Connection conn = null;

    public ArtikelDAO() throws ClassNotFoundException, SQLException {

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
            stat.execute("create table IF NOT EXISTS artikel(artikelname varchar(50),artikelnr int(100), vorhandeneStk int(100),preis int(100));");
            System.out.println("Table artikel wurde erstellt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean newArtikel(String artikelname, int artikelnr, int vorhandeneStk, int preis) throws ClassNotFoundException, SQLException {
        
        createTable();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datenverwaltung", "root", "");

            Statement stmt = conn.createStatement();

            String doesArtikelExist = "select artikelname from artikel;";
            String strSql = "INSERT INTO artikel(artikelname, artikelnr, vorhandeneStk, preis) VALUES ('" + artikelname + "','" + artikelnr + "','" + vorhandeneStk + "','" + preis + "');";

            ResultSet set = stmt.executeQuery(doesArtikelExist);

            while (set.next()) {
                if (artikelname.equals(set.getString("artikelname"))) {
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
}
