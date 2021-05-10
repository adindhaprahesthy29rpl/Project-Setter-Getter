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
public class Kastangel extends Toko1 {
    
    //Variabel Instance
    String topping;
    
    //Method set untuk topping
    public void setTopping(String topping){ //Menerapkan parameter
        this.topping = topping;
    } 
    
    //Method get untuk topping
    public String getTopping(){
        System.out.println("Topping : "+topping);
        return topping;
    }
    
    //Method set untuk judul 2
    public void judul2(){
        System.out.println(" ");
        System.out.println(" DAFTAR KANDUNGAN GIZI KASTANGEL");
        System.out.println("================================");
    }
    
    //Method set untuk protein
    public void setProtein(int protein){
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
         System.out.println("           Line : Cookies_id             ");
     }
    
}
