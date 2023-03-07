/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author Windows 10
 */
public class kalkulator {
    public double angka1,angka2;
    public kalkulator(int angka1,int angka2){
        this.angka1 = angka1;
        this.angka2= angka2;
    }
    public double tambah(){
        return this.angka1 + this.angka2;
    }
    
    public double kurang(){
        return this.angka1 - this.angka2;
    }
    
    public double kali(){
        return this.angka1 * this.angka2;
    }
    public double bagi(){
        return this.angka1 + this.angka2;
    }
    public double sisaBagi(){
        return this.angka1%this.angka2;
    }
}
