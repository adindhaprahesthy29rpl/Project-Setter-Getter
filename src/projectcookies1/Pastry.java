/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcookies1;

/**
 *
 * @author MOKLET-2
 */
public class Pastry extends Toko1 {
    
    //Variabel Instance
    String jenis;
    
    //Method set untuk jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    } 
    
    //Method get untuk jenis
    public String getJenis(){
        System.out.println("Jenis : "+jenis);
        return jenis;
    }
    
    //Method set untuk judul 3
    public void judul3(){
        System.out.println(" ");
        System.out.println("  DAFTAR KANDUNGAN GIZI PASTRY  ");
        System.out.println("================================");
    }
    
    //Method set untuk protein
    public void setProtein(int protein){ //Menerapkan parameter
        super.protein = protein;
    }
    
    //Method get untuk protein
    public float getProtein(){
        System.out.println("Total Protein : "+protein+" %");
        return protein;
    }
    
    //Method set untuk karbohidrat
    public void setKarbohidrat(int karbohidrat){
        super.karbohidrat = karbohidrat;
    }
    
    //Method get untuk karbohidrat
    public float getKarbohidrat(){
        System.out.println("Total Karbohidrat : "+karbohidrat+" %");
        return karbohidrat;
    }
    
    //Method set untuk lemak
    public void setLemak(int lemak){
        super.lemak = lemak;
    }
    
    //Method get untuk lemak
    public float getLemak(){
        System.out.println("Total Lemak : "+lemak+" %");
        return lemak;
    }
    
    // Method untuk menampilkan pesan (overriding)
    public void pesan(){
         System.out.println("              --THANK YOU--              ");
         System.out.println("=========================================");
     }
}

   
