/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author Windows 10
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Budi";
        String alamat = "Sidoarjo";
         
        int totalgaji = 0;
        
        System.out.println("Karyawan : "+nama);
        System.out.println("Alamat : "+alamat);
        Gaji penghasilan = new Gaji("it","mobile","expert");
        System.out.println("Gaji Departemen " + penghasilan.departemen + " = "+penghasilan.gajiDepartemen());
        totalgaji += penghasilan.gajiDepartemen();
        
        System.out.println("Gaji Skill " + penghasilan.skill + " = "+penghasilan.gajiSkill());
        totalgaji+= penghasilan.gajiSkill();
        
        System.out.println("Gaji Pengalaman " + penghasilan.pengalaman + " = "+penghasilan.gajiPengalaman());
        totalgaji += penghasilan.gajiPengalaman();
        
        System.out.println("Total Gaji = "+totalgaji);
    }
    
}
