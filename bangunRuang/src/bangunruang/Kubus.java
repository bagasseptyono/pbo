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
    float sisi,volume;
    public Kubus(float sisiBaru){
        this.sisi = sisiBaru;
    }
    private void setSisi(float sisi){
        this.sisi = sisi;
    }
    private void ComputeAndSetVolume(){
        this.volume = this.sisi *this.sisi *this.sisi;
    }
    public float GetVolume(){
        this.setSisi(this.sisi);
        this.ComputeAndSetVolume();
        return this.volume;
    }
}
