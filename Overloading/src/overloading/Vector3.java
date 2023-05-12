/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;
/**
 *
 * @author Windows 10
 */
public class Vector3 {
    public int [] vektor;

    public Vector3(int [] vektor){
        this.vektor = vektor;
    }
    public int[] perkalian(int skalar){
        int[] hasil = new int[this.vektor.length];
        for (int i = 0; i < vektor.length; i++) {
            hasil[i]= this.vektor[i] * skalar;
        }
        return hasil;
    }
    public int perkalian(int[] vektor){
        int hasil = 0;
        for (int i = 0; i < vektor.length; i++) {
            hasil += (this.vektor[i] * vektor[i]);
        }
        return hasil;
    }
}
