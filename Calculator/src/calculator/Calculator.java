/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. Sisah Bagi");
        System.out.println("Input Pilihan :");
        int pilihan = input.nextInt();
        System.out.println("Masukan angka1 :");
        int angka1 = input.nextInt();
        System.out.println("Masukkan angka2 :");
        int angka2 = input.nextInt();
        
        kalkulator hitung = new kalkulator(angka1,angka2);
        if (pilihan == 1) {
            System.out.println("Penjumlahan "+angka1 + "+" +angka2 + " = "+hitung.tambah());
        }else if(pilihan ==2){
            System.out.println("Pengurangan "+angka1 + "-" +angka2 + " = "+hitung.kurang());
        }else if(pilihan ==3){
            System.out.println("Perkalian "+angka1 + "*" +angka2 + " = "+hitung.kali());
        }else if(pilihan ==4){
            System.out.println("Pembagian "+angka1 + "/" +angka2 + " = "+hitung.bagi());
        }else if(pilihan ==5){
            System.out.println("Sisah Bagi "+angka1 + "%" +angka2 + " = "+hitung.sisaBagi());
        }
        
        
        
    }
    
}
