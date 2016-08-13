/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import javax.swing.JOptionPane;

/**
 *
 * @author Riccardo
 */
public final class Utilita {
    public static void mostraMessaggio(String s)
    {
        JOptionPane.showMessageDialog(null, s);
    }
    public static void mostraMessaggioErrore(String s)
    {
        JOptionPane.showMessageDialog(null, s,"Errore",JOptionPane.ERROR_MESSAGE);
    }
}
