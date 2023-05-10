/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Windows 10
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koleksi koleksi1 = new Koleksi("Adinda","SIDU",2002);
        System.out.println(koleksi1.toString());
        
        Buku buku1 = new Buku("Siksa Neraka","Andik", "Laskar" ,2015);
        System.out.println(buku1.toString());
        
        Majalah majalah1 = new Majalah("Bobo","Siang","BOBOK", 2021);
        System.out.println(majalah1.toString());
        
        Skripsi skripsi1 = new Skripsi("12333123","Sulistyo","PHP SEBAGAI BAHASA PROGRAM","SatuRasa",2023);
        System.out.println(skripsi1.toString());
    }
    
}
