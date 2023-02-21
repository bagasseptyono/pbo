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
    public int LengthOfSide = 7;
    
    public int calculateArea(){
        int area;
        area = this.LengthOfSide * this.LengthOfSide;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = LengthOfSide * 4;
        return perimeter;
    }
}
