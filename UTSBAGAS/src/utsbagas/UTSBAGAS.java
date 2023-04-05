/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsbagas;

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
        
        String Halte[] = {"Kantor", "Porong", "Surabaya", "Gresik"};
        int jumlahTujuan[] = {0,0,0,0};
        Bus bus1 = new Bus();
        Halte[] halte  = new Halte[4];
        for (int i = 0; i < halte.length; i++) {
            halte[i] = new Halte("halo",5);
        }
        int[] halte0 = {0,1,2,0};
        bus1.posisi(3, halte0);
        bus1.jalan();
        int[] halte1 = {0,0,2,0};
        bus1.posisi(2,halte1);
    }
    
}
