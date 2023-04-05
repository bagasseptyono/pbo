package uts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class Bus {
    public int penumpang = 5;
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
        this.jumlahTujuan[transit]=0;
        this.turun = this.jumlahTujuan[transit];
        this.penumpang -= this.turun;
    }
    void jalan(int naik, int[] tujuan){
        this.transit++;
        this.penumpangTurun();
        this.penumpangNaik(naik,tujuan);
        System.out.println("Penumpang = "+ this.penumpang);
        System.out.println("Halte = " + this.Halte[this.transit]);
    }
    
}
