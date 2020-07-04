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
public class contoh_scanner {
    public static void main(String[] args) {
        //input
         Scanner input = new Scanner(System.in);
         System.out.println(" nama :");
         String Nama = input.nextLine();
         System.out.println(" alamat :");
         String Alamat = input.nextLine();
         System.out.println("hobi :");
         String Hobi = input.nextLine();
         System.out.println(" kelas :");
         String Kelas = input.nextLine();
         System.out.println(" jurusan :");
         String Jurusan = input.nextLine();
         //output
         System.out.println("========== BIODATA =========");
         System.out.println(" nama    :" + Nama);
         System.out.println(" alamat  :" + Alamat);
         System.out.println(" hobi    :" + Hobi);
         System.out.println(" kelas   :" + Kelas);
         System.out.println(" Jurusan :" + Jurusan);
    }
    
}
