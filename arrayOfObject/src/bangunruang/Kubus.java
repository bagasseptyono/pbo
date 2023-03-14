/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class Kubus {
    public double sisi,volume;
    public Kubus(){
        this.sisi = 5;
    }
    public Kubus(float sisiBaru){
        this.sisi = sisiBaru;
    }
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    private void computeAndSetVolume(){
        this.volume = this.sisi *this.sisi *this.sisi;
    }
    public double getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}
