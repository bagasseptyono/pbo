/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Windows 10
 */
public class Rectangle {
    public double lebar = 16;
    public double panjang = 7;
    
    public double calculateArea(){
        return this.panjang * this.lebar;
    }
    public double calculatePerimeter(){
        return (this.panjang+this.lebar)*2;
    }
    
}
