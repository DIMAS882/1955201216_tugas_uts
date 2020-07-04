/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class contoh_joptionpane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("nama kamu siapa?" );
        JOptionPane.showConfirmDialog(null, "saya" + nama);
        String umur = JOptionPane.showInputDialog("umur kamu berapa?" );
        JOptionPane.showConfirmDialog(null, "umur" + nama);
        String saudara = JOptionPane.showInputDialog("saudara kamu berapa?" );
        JOptionPane.showConfirmDialog(null, "saudara" + nama);
        String ayah = JOptionPane.showInputDialog("ayah kamu kerja dimana?" );
        JOptionPane.showConfirmDialog(null, "ayah" + nama);
        String ibu = JOptionPane.showInputDialog("ibu kamu dimana?" );
        JOptionPane.showConfirmDialog(null, "ibu" + nama);
    }
 
     
    
}

