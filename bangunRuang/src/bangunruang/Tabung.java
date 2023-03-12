/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class Tabung {
    public double radius, tinggi, volume;
    public Tabung(){
        this.radius = 7;
        this.tinggi = 10;
    }
    public Tabung(float radius,float tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    private void computeAndSetVolume(){
        this.volume = 3.14159 * this.radius * this.radius * this.tinggi;
    }
    public double getVolume(){
    this.computeAndSetVolume();
    return this.volume;
    }
}
