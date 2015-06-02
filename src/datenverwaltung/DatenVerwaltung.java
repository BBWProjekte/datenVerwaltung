/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datenverwaltung;

import gui.LoginGUI;

/**
 *
 * @author 5ia13rimanavalan
 */
public class DatenVerwaltung {
    
    private LoginGUI lg;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LoginGUI test = new LoginGUI();
        test.setVisible(true);
        test.setBounds(500, 500, 400, 250);

        test.setResizable(false);
    }
    
}
