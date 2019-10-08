/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan23nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("===PROGRAM NILAI TERBESAR DAN TERKECIL===");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyakMhs = input.nextInt();
        
        //deklarasi array
        int[] nilaiMhs = new int[banyakMhs];
        
        for(int i = 1; i <= banyakMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " : ");
            nilaiMhs[i-1] = input.nextInt();
        }
        System.out.println("");
        System.out.println("------Nilai Mahasiswa-----");
        for(int k = 1; k <= banyakMhs; k++){
            System.out.println("Nilai Mahasiswa ke-" + k + " : " + nilaiMhs[k-1]);
        }
        System.out.println("");
        int nilaiMax  = nilaiMhs[0];
        int nilaiMin = nilaiMhs[0];
        for (int j = 0; j <= banyakMhs-1; j++){
            if(nilaiMhs[j] > nilaiMax){
                nilaiMax = nilaiMhs[j];
            } else if(nilaiMin < nilaiMhs[j]){
                nilaiMin = nilaiMhs[j];
            }
        }
        System.out.println("Nilai Terbesar adalah " + nilaiMax);
        System.out.println("Nilai Terkecil adalah " + nilaiMin);
        System.out.println("");
        System.out.println("(Developed by mrakhaf)");
       
        
    }
    
}
