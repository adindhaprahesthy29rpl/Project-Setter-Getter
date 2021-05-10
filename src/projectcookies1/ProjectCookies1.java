/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcookies1;

import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class ProjectCookies1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko1 objek1 = new Toko1(); // Objek untuk memanggil class Toko1
        Nastar objek2 = new Nastar(); // Objek untuk memanggil class Nastar
        Kastangel objek3 = new Kastangel(); // Objek untuk memanggil class Kastangel
        Pastry objek4 = new Pastry(); // Objek untuk memanggil class Pastry
        
        Scanner input = new Scanner(System.in);
        
        // Untuk menjalankan method
        objek1.judul();
        objek1.daftarMenu();
        
        objek2.judul1();
        objek2.setProtein(6); //Nilai
        objek2.setKarbohidrat(68); //Nilai
        objek2.setLemak(26); //Nilai
        objek2.getProtein();
        objek2.getKarbohidrat();
        objek2.getLemak();
        System.out.print("Masukkan Varian Rasa Nastar : "); //user memasukkan varian rasa nastar
        objek2.setVarian(input.next());
        objek2.getVarian();
        
        objek3.judul2();
        objek3.setProtein(6); //Nilai
        objek3.setKarbohidrat(68); //Nilai
        objek3.setLemak(26); //Nilai
        objek3.getProtein();
        objek3.getKarbohidrat();
        objek3.getLemak();
        System.out.print("Masukkan Varian Topping Kastangel : "); //user memasukkan varian topping kastangel
        objek3.setTopping(input.next());
        objek3.getTopping();
        
        objek4.judul3();
        objek4.setProtein(6); //Nilai
        objek4.setKarbohidrat(68); //Nilai
        objek4.setLemak(26); //Nilai
        objek4.getProtein();
        objek4.getKarbohidrat();
        objek4.getLemak();
        System.out.print("Masukkan Jenis Pastry : "); //user memasukkan jenis pastry
        objek4.setJenis(input.next());
        objek4.getJenis();
        
        objek1.setAdmin("Cansevva"); //Nilai
        objek1.getAdmin();
        objek1.pemesanan();
        objek1.pilihan();
        objek1.pesan();
        objek2.pesan();
        objek3.pesan();
        objek4.pesan();
    }   
    }
    

