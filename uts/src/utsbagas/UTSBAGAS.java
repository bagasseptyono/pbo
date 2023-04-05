/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsbagas;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class UTSBAGAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
//        String daftarHalte[] = {"Kantor", "Porong", "Surabaya", "Gresik"};
//        int jumlahTujuan[] = {0,0,0,0};
        
        Bus bus1 = new Bus();
        Halte[] halte  = new Halte[4];
        
        halte[0] = new Halte("Kantor",10,new int[]{0,5,2,3},bus1.penumpang);
        System.out.println(halte[0].penumpangTunggu);
        halte[1] = new Halte("Porong",5,new int[]{0,0,2,3},bus1.penumpang);
        halte[2] = new Halte("Surabaya",7,new int[]{0,0,0,7},bus1.penumpang);
        halte[3] = new Halte("Gresik",0,new int[]{0,0,0,0},bus1.penumpang);
        
        bus1.posisi(halte[0].penumpangTunggu, halte[0].tujuanPenumpang);
        bus1.jalan();
        bus1.posisi(halte[1].penumpangTunggu,halte[1].tujuanPenumpang);
        bus1.jalan();
        bus1.posisi(halte[2].penumpangTunggu,halte[2].tujuanPenumpang);
        bus1.jalan();
        bus1.posisi(halte[3].penumpangTunggu, halte[3].tujuanPenumpang);
    }
    
}
