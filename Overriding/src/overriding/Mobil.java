package overriding;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class Mobil extends Kendaraan {
    protected String model;
    public Mobil(String merk, int tahun,String jenis,String model ){
        super(merk, tahun,jenis);
        this.model = model;
    }
    public void jalan(){
        System.out.println("Mobil "+this.merk+" "+this.tahun+" Berjalan");
    }
}
