/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class contoh_swichcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String minuman,pilih,bonus;
        int total,jumlah,harga,total_bayar;
        
        System.out.println("======WARUNG KOPI======");
        System.out.println("");
        
        System.out.println("1.kopi susu  2.kopi hitam 3.teh hangat ");
        System.out.println("masukkan pilihan anda");
        pilih = input.nextLine();
        
        switch (pilih){
            case "1" : minuman = "kopi susu";
            harga = 4000;
            break;
            case "2" : minuman = "kopi hitam";
            harga = 3000;
            break;
            case "3" : minuman = "teh hangat";
            harga = 2000;
            break;
            default : minuman = "tidak ada";
            harga = 0;
            break;
            
        }
        System.out.println("jumlah yang di beli");
        jumlah = input.nextInt();
        total = harga*jumlah;
        if (total>=10000)
        bonus ="rokok 1 batang";
        else
        bonus = "krupuk 1";
        
         System.out.println(" kopi :" + minuman);
        System.out.println(" harga   :" + harga);
        System.out.println(" jumlah beli :" + jumlah);
        System.out.println(" total :" + total);
        System.out.println(" bonus :" + bonus);
        
        
        
    }
    
}


