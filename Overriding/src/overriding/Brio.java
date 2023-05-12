/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author Windows 10
 */
public class Brio extends Mobil{
    protected int kecepatan;
    protected final String nama="Brio";

    public Brio(String merk, int tahun,String jenis, String model) {
        super(merk, tahun,jenis, model);
        
    }
    public void jalan(){
        System.out.println("Mobil "+this.merk+" "+this.nama + " "+this.tahun+" Berjalan");
    }
    public String jalan(int kecepatan){
        this.kecepatan = kecepatan;
        return "Mobil "+this.merk+" "+this.nama + " "+this.tahun+" Berjalan kecepatan "+this.kecepatan +"km/jam";
    }
    public void info(){
        System.out.println(this.merk+", "+this.nama + ", "+this.tahun+", "+this.jenis+", "+this.model);
    }
}
