/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.adrianmaidiyangsa.tandanyakamu;
import java.util.*;

/**
 *
 * @author Beta Three
 * NAMA     : ADRIAN MAIDIYANGSA
 * KELAS    : IF-1
 * NIM      : 10119029
 * TUGAS    : UTS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+umur.getYearBirth());
        System.out.println("Hari ini tahun : "+umur.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+umur.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+umur.tandanyaKamu(umur.hitungUmur()));

    }
}
