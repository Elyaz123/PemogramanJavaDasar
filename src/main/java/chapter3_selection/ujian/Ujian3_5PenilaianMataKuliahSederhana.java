package chapter3_selection.ujian;

import java.util.Scanner;

public class Ujian3_5PenilaianMataKuliahSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Penilaian (Rentang nilai 0 - 100)");

        System.out.print("Masukan Nilai Kehadiran: " );
        double kehadiran = input.nextDouble();
        System.out.print("Masukan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double project = input.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        double uts = input.nextDouble();
        System.out.print("Mmasukan Nilai Project Akhir: ");
        double uas = input.nextDouble();

        System.out.println();
        //Index nilai
        double nilai = 0;
        nilai = 0.05 * kehadiran + 0.20 * tugas + 0.30 * project + 0.20 * uts + 0.25 * uas;

        if(nilai >= 90 ) {
            System.out.println("Selamat Anda Lulus dengan nilai A");
        } else if (nilai >= 85) {
            System.out.println("Selamat Anda Lulus dengan nilai B+");
        } else if (nilai >= 80) {
            System.out.println("Selamat Anda Lulus dengan nilai B");
        } else if (nilai >= 75) {
            System.out.println("Selamat Anda Lulus dengan nilai B-");
        } else if (nilai >= 70) {
            System.out.println("Selamat Anda Lulus dengan nilai C+");
        } else if (nilai >= 65) {
            System.out.println("Selamat Anda Lulus dengan nilai C");
        } else if (nilai >= 60) {
            System.out.println("Selamat Anda Lulus dengan nilai C-");
        } else if (nilai >= 50) {
            System.out.println("Nilai Anda D dinyatakan Tidak Lulus \nAnda harus mengulang mata kuliah ini");
        } else if (nilai <= 50) {
            System.out.println("Nilai anda E dinyatakan Tidak Lulus \nAnda harus mengulang mata kuliah ini");
        }else {

        }
    }
}
