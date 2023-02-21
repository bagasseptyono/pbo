/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Windows 10
 */
public class Gaji {
    String departemen;
    String skill; 
    String pengalaman;
    public Gaji(String inputDepartemen,String inputSkill, String inputPengalaman){
        this.departemen = inputDepartemen;
        this.skill = inputSkill;
        this.pengalaman = inputPengalaman;
    }
    
    int gajiDepartemen(){
        switch (this.departemen) {
            case "it":
                return 8000000;
            case "hrd":
                return 5000000;
            case "finance":
                return 4000000;
            default:
                return 0;
        }
        
    }
    
    int gajiSkill(){
        switch (this.skill) {
            case "web":
                return 1000000;
            case "mobile":
                return 2000000;
            case "desktop":
               return 2500000;
            default:
                return 0;
        }
        
    }
    
    int gajiPengalaman(){
        switch (this.pengalaman) {
            case "pemula":
                return 500000;
            case "menengah":
                return 1000000;
            case "expert":
                return 2000000;
            default:
                return 0;
        }
    }
}
