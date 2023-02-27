/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Windows 10
 */
public class Circle {
    public double phi = 3.14;
    public double jariJari = 7;
    
    public double calculateArea(){
        return this.phi * this.jariJari * this.jariJari;
    }
    
    public double calculatePerimeter(){
        return 2 * this.phi * this.jariJari;
    }
}
