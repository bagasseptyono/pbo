/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsbagas;

/**
 *
 * @author Windows 10
 */
public final class Halte {
    public int penumpangTunggu;
    public String namaHalte;
    public int [] tujuanPenumpang ;
    public int [] tujuanPenumpangNaik;
    public int naik;
    public int turun;
    private int penumpangBis;
    public Halte(String namaHalte,int penumpangTunggu, int[] tujuanPenumpang,int penumpangBis){
        this.namaHalte = namaHalte;
        this.penumpangBis = penumpangBis;
        this.tujuanPenumpang = tujuanPenumpang;
        this.penumpangTunggu = penumpangTunggu;
    }
    
}
