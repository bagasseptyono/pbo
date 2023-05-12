/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author Windows 10
 */
public class Kendaraan {
    protected String merk;
    protected int tahun;
    protected String jenis;
    public Kendaraan(String merk, int tahun,  String jenis){
        this.merk = merk;
        this.tahun = tahun;
        this.jenis = jenis;
    }
    public void info(){
        System.out.println(this.merk+", "+this.tahun+", "+this.jenis);
    }
}
