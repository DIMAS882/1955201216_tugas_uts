/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

/**
 *
 * @author HP
 */
public class contoh_bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String alamat;
        String sekolah;
        String hobi;
        String nama_ayah;
        
        
        //input
        System.out.println(" masukkan nama anda");
        nama = br.readLine();
        System.out.println(" masukkan alamat anda  ");
        alamat = br.readLine();
        System.out.println(" masukkan nama sekolah ");
        sekolah = br.readLine();
        System.out.println(" hobi kamu apa ? ");
        hobi = br.readLine();
        System.out.println(" nama ayah anda ");
        nama_ayah = br.readLine();
        
        //out put
        System.out.println("nama     : " + nama);
        System.out.println("alamat   : " + alamat);
        System.out.println("sekolah  : " + sekolah);
        System.out.println("hobi     : " + hobi);
        System.out.println("nam ayah :" + nama_ayah);
        
   }
    
}
