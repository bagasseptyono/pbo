/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Windows 10
 */
public class Square {
    public double sisi = 7;
    
    public double calculateArea(){
        double area;
        area = this.sisi * this.sisi;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = sisi * 4;
        return perimeter;
    }
}
