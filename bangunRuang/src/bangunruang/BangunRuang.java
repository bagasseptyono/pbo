/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus cube = new Kubus(20);
        System.out.println(" KUBUS");
        System.out.println("Sisi = "+ cube.sisi );
        System.out.println("Volume Kubus = "+ String.format("%.2f", cube.getVolume()));
        
        
        Balok block = new Balok(20,12,10);
        System.out.println("\n BALOK");
        System.out.println("Panjang = "+ block.panjang );
        System.out.println("Lebar = "+ block.lebar);
        System.out.println("Tinggi = "+ block.tinggi );
        System.out.println("Volume Balok = "+ String.format("%.2f", block.getVolume()));
        
        
        Tabung tube = new Tabung(7,14);
        System.out.println("\n TABUNG");
        System.out.println("Radius = "+ tube.radius);
        System.out.println("Tinggi = " + tube.tinggi);
        System.out.println("Volume Tabung = " + String.format("%.2f", tube.getVolume()));
        
        LimasSegiEmpat pyramid = new LimasSegiEmpat(5,8);
        System.out.println("\n LIMAS SEGI EMPAT");
        System.out.println("Sisi = "+ pyramid.sisi );
        System.out.println("Tinggi = " + pyramid.tinggi);
        System.out.println("Volume Limas = "+ String.format("%.2f", pyramid.getVolume()));
        
        Bola ball = new Bola(5);
        System.out.println("\n BOLA");
        System.out.println("Radius = " + ball.radius);
        System.out.println("Volume Bola = "+ String.format("%.2f", ball.getVolume()));
    }
    
}
