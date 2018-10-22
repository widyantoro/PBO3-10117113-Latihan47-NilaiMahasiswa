/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan47.nilaimahasiswa;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menghitung Nilai Akhir dan menampilkan index nilai
 *            dari nilai Quiz, UTS, dan UAS.
 *            
 */
public class PBO310117113Latihan47NilaiMahasiswa {

    private static double quiz,uts,uas,NA;
    private static String index;
    private static String keterangan;
    
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
       Mahasiswa objMahasiswa = new Mahasiswa();
       
       System.out.print("QUIZ : ");
       quiz = baca.nextDouble();
       System.out.print("UTS  : ");
       uts = baca.nextDouble();
       System.out.print("UAS  : ");
       uas = baca.nextDouble();
       System.out.println("");
       System.out.print("Nilai Akhir : " + objMahasiswa.NA(quiz, uts, uas));
       System.out.println("");
       System.out.println("");
       System.out.println("Index : " + objMahasiswa.aturanIndex(index));
       objMahasiswa.aturanKeterangan(keterangan);
       
    }
    
}
