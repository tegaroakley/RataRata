/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan21.ratarata;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan21RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        double mhs = scanner.nextDouble();
        double nilai = 0;
        for (int i = 1 ; i <= mhs; i++){
            System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
            nilai = nilai +scanner.nextDouble();
            
            
        }
        double rata;
            rata = nilai / mhs ;
            System.out.println("Maka, Rata-rata Nilainya Adalah : "+ rata);
            System.out.println("(Developed by : Tegar Lucky'q Oakley)");
        
        
    }
    
}
