/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsbagas;

/**
 *
 * @author Windows 10
 */
public class Bus {
    public int penumpang;
    public int maxPenumpang = 20;
    public int naik , turun;
    public String Halte[] = {"Kantor", "Porong", "Surabaya", "Gresik"};
    public int jumlahTujuan[] = {0,0,0,0};
    public int transit=0;
    public Bus(){
        this.naik = 0;
        this.turun = 0;
    }
    public Bus(int naik, int turun){
        this.naik = naik;
        this.turun = turun;
    }
    void penumpangNaik(int naik, int[] tujuan){
        this.naik = naik;
        for (int i = 0; i < this.jumlahTujuan.length; i++) {
            this.jumlahTujuan[i] += tujuan[i];
        }
        this.penumpang += this.naik;
    }
    void penumpangTurun(){
        
        this.turun = this.jumlahTujuan[transit];
        this.jumlahTujuan[transit]=0;
        this.penumpang -= this.turun;
    }
    void infoPenumpang(int[] tujuan){
        for (int i = 0; i < tujuan.length; i++) {
            if (tujuan[i]>0) {
                System.out.println("    "+tujuan[i] + " Tujuan " + Halte[i]);
            }
        }
    }
    
    void jalan(){
      this.transit++;  
    }
    void posisi(int naik, int[] tujuan){
        this.penumpangTurun();
        this.penumpangNaik(naik,tujuan);
        System.out.println("Halte " + this.Halte[this.transit]);
        System.out.println("Turun = "+ this.turun);
        System.out.println("Naik = "+ this.naik);
        this.infoPenumpang(tujuan);
        System.out.println("Penumpang = "+ this.penumpang);
        System.out.println(" ");
        
    }
}
