/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Windows 10
 */
public class Elips {
    public double phi = 3.14;
    public double garisVertikal = 7;
    public double garisHorizontal = 14;
    
    public double calculateArea(){
        return this.phi * this.garisHorizontal * this.garisVertikal;
    }
    public double calculatePerimeter(){
        return this.phi * (this.garisHorizontal + this.garisVertikal);
    }
}
