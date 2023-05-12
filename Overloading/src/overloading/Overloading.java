/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

import java.util.Arrays;

/**
 *
 * @author Windows 10
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector3 vektorObjek = new Vector3(new int []{1,2,3});
        //perkalian skalar
        System.out.println(Arrays.toString(vektorObjek.perkalian(5)));
        //perkalian vektor
        System.out.println(vektorObjek.perkalian(new int[]{4,5,6}));
        
    }
    
}
