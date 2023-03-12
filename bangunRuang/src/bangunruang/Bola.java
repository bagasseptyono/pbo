/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Windows 10
 */
public class Bola {
    public double radius, volume;
    public Bola(){
        this.radius = 7;
    }
    public Bola(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    private void computeAndSetVolume(){
        this.volume = (4 * 3.14159 * this.radius * this.radius * this.radius) /3;
    }
    public double getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}
