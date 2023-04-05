/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsbagas;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Halte {
    public int penumpang;
    public String namaHalte;
    public int [] tujuanPenumpang ;
    public Halte(String namaHalte, int penumpang){
        this.namaHalte = namaHalte;
        this.penumpang = penumpang;
    }
    public void setTujuanPenumpang(int[] tujuan){
        for (int j = 0; j < this.tujuanPenumpang.length; j++) {
            tujuanPenumpang[j] = tujuan[j];
        }
    }
}
