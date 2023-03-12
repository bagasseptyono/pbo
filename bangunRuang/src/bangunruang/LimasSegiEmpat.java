/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class LimasSegiEmpat {
    public double sisi, tinggi, volume;
    public LimasSegiEmpat(){
        this.sisi = 14;
        this.tinggi = 10;
    }
    public LimasSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    private void computeAndSetVolume(){
        this.volume =  (this.sisi * this.sisi * this.tinggi) /3;
    }
    public double getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}
