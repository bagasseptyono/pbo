/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author Windows 10
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square persegi = new Square();
        Rectangle persegiPanjang = new Rectangle();
        Circle lingkaran = new Circle();
        Elips oval = new Elips();
        
        System.out.println("Sisi : "+ persegi.sisi);
        System.out.println("Luas Persegi : " + persegi.calculateArea());
        System.out.println("Keliling Persegi : " + persegi.calculatePerimeter() + "\n");
        
        System.out.println("Panjang : "+ persegiPanjang.panjang + " , Lebar :" + persegiPanjang.lebar);
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.calculateArea());
        System.out.println("Keliling Pesegi Panjang : " + persegiPanjang.calculatePerimeter()+ "\n");
        
        System.out.println("Jari-jari : "+ lingkaran.jariJari);
        System.out.println("Luas Lingkaran : " + lingkaran.calculateArea());
        System.out.println("Keliling Lingkaran : " + lingkaran.calculatePerimeter()+ "\n");
        
        System.out.println("Garis Vertikal(b) : "+ oval.garisVertikal + " , Garis Horizontal(a) : " +oval.garisHorizontal);
        System.out.println("Luas Oval : " + oval.calculateArea());
        System.out.println("Keliling Oval : " + oval.calculatePerimeter()+ "\n");
        
        
    }
    
}
