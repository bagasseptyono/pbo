/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class Balok {
    public double panjang,lebar,tinggi, volume;
    public Balok(){
        this.lebar = 5;
        this.panjang = 8;
        this.tinggi = 10;
    }
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public void setPanjang(int panjang){
        this.panjang=panjang;
    }
    public void setLebar(int lebar){
        this.lebar=lebar;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    private void computeAndSetVolume(){
        this.volume = this.panjang * this.lebar *this.tinggi;
    }
    public double getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}
