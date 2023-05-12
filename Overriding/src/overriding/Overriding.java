/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author Windows 10
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Toyota",2016,"Matic");
        Mobil mobil1 = new Mobil("BMW",2019,"Manual","Sport");
        Brio brio1 = new Brio("Honda",2016,"Matic", "Keluarga");
        
        Avanza avanza1 = new Avanza("Toyota",2021,"Manual", "Keluarga");
        
        mobil1.jalan();
        brio1.jalan();
        System.out.println(brio1.jalan(50));
        kendaraan1.info();
        brio1.info();
        avanza1.info();
        System.out.println(avanza1.jalan(90));
        
    }
    
}
