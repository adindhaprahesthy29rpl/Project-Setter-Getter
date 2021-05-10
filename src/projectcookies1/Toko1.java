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
public class Toko1 {
    // Inputan user   
    Scanner input = new Scanner(System.in);

    //Variabel Instance
    public String admin, nama, noHp;
    public int pilihan, banyak, totalHarga, pembayaran, kembalian;
    public int protein, lemak, karbohidrat;
   
    //Method judul
    public void judul(){
        System.out.println("=============================================");  
        System.out.println("           PROGRAM MEMBELI COOKIES           ");
        System.out.println("=============================================");  
    }
    
    //Method daftar menu
    public void daftarMenu(){
        System.out.println(" ");
        System.out.println("             DAFTAR MENU COOKIES             ");
        System.out.println("---------------------------------------------");  
        System.out.println("| NO |  MENU COOKIES  |     HARGA    |");
        System.out.println("| 1. |  Nastar        | Rp. 90.000-, |");
        System.out.println("| 2. |  Kastangel     | Rp. 80.000-, |");
        System.out.println("| 3. |  Pastry        | Rp. 70.000-, |");
        System.out.println("---------------------------------------------"); 
    }
    
    //Method set admin
    public void setAdmin(String admin){
        System.out.println(" ");
        this.admin = admin;
    }
    
    //Method get admin
    public String getAdmin(){
        System.out.println("Admin Toko : "+admin);
        return admin;
    }
    
    // Method untuk pemesanan cookies
    public void pemesanan(){
        System.out.println(" "); // Penjeda
        System.out.print("Masukkan Nama Anda : ");
         nama = input.nextLine();      
        System.out.print("Masukkan Pilihan Anda [1/2/3/4] : ");
         pilihan = input.nextInt(); 
    }
    
    // Method untuk memilih 
    public void pilihan(){ 
         switch (pilihan) { // Kondisi percabangan dengan menggunakan switch case
            case (1): // Case 1 atau pilihan 1
                System.out.println("Pilihan Anda Adalah | 1. |  Nastar        | Rp. 90.000-, |"); // Menampilkan tiket yang dipesan
                System.out.println("Harga Nastar               : Rp. 90.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.println("Masukkan Jumlah Nastar     : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 90000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextInt(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda           : Rp. "+kembalian); // Menampilkan kembalian  
                
                System.out.println(" ");
                System.out.println("=========================================");
                System.out.println("          NOTA PEMBELIAN COOKIES         ");
                System.out.println("=========================================");
                System.out.println("| 1. |  Nastar        | Rp. 90.000-, |");
                System.out.println("Banyak    : "+banyak);
                System.out.println("Total     : "+totalHarga);
                System.out.println("Jum Bayar : "+pembayaran);
                System.out.println("kembalian : "+kembalian);
                System.out.println("-----------------------------------------");
                System.out.println("");                
                break; // Berhenti
    
            case (2):
                System.out.println("Pilihan Anda Adalah | 2. |  Kastangel        | Rp. 80.000-, |"); // Menampilkan tiket yang dipesan
                System.out.println("Harga Nastar               : Rp. 80.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.println("Masukkan Jumlah Kastangel     : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 80000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextInt(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda           : Rp. "+kembalian); // Menampilkan kembalian  

                System.out.println(" ");
                System.out.println("=========================================");
                System.out.println("          NOTA PEMBELIAN COOKIES         ");
                System.out.println("=========================================");
                System.out.println("| 2. |  Kastangel        | Rp. 80.000-, |");
                System.out.println("Banyak    : "+banyak);
                System.out.println("Total     : "+totalHarga);
                System.out.println("Jum Bayar : "+pembayaran);
                System.out.println("kembalian : "+kembalian);
                System.out.println("-----------------------------------------");
                System.out.println("");  
                break; // Berhenti
     
            case (3):
                System.out.println("Pilihan Anda Adalah | 3. |  Pastry        | Rp. 70.000-, |"); // Menampilkan tiket yang dipesan
                System.out.println("Harga Nastar               : Rp. 70.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.println("Masukkan Jumlah Pastry     : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 70000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextInt(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda           : Rp. "+kembalian); // Menampilkan kembalian  
                
                System.out.println(" ");
                System.out.println("=========================================");
                System.out.println("          NOTA PEMBELIAN COOKIES         ");
                System.out.println("=========================================");
                System.out.println("| 3. |  Pastry        | Rp. 70.000-, |");
                System.out.println("Banyak    : "+banyak);
                System.out.println("Total     : "+totalHarga);
                System.out.println("Jum Bayar : "+pembayaran);
                System.out.println("kembalian : "+kembalian);
                System.out.println("-----------------------------------------");
                System.out.println("");  
                break; // Berhenti
                
            case (4):
                System.out.println("Mohon Maaf !! Pilihan tidak tersedia !! ");
                break; // Berhenti
        }
    }
    
     // Method untuk menampilkan pesan (overriding)
     public void pesan(){
         System.out.println(" ");
         System.out.println("             KRITIK & SARAN              ");
     }
         
}
