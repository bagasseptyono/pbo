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
        LimasSegiEmpat[] limas = new LimasSegiEmpat[5];
        limas[0] = new LimasSegiEmpat(7,8);
        limas[1] = new LimasSegiEmpat(5,20);
        limas[2] = new LimasSegiEmpat(7,10);
        limas[3] = new LimasSegiEmpat(8,12);
        limas[4] = new LimasSegiEmpat(9,12);
        
        
        double[] volume= new double[limas.length];
        for (int i = 0; i < limas.length; i++) {
            System.out.print("Limas "+(i+1));
            System.out.print(", Sisi = "+ limas[i].sisi);
            System.out.print(", Tinggi = "+ limas[i].tinggi);
            System.out.print(", Volume = "+ limas[i].getVolume());
            System.out.println();
            System.out.println("-----------------------------------------");
            volume[i] = limas[i].getVolume();
        }
        double hasil = 0;
        for (double temp : volume) {
            hasil += temp;
        }
        hasil /= volume.length;
        System.out.println("rata-rata = "+hasil);
    }
}
