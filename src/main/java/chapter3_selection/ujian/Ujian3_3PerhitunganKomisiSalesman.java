package chapter3_selection.ujian;

import java.util.Scanner;

public class Ujian3_3PerhitunganKomisiSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama sales");
        String namaSales = input.next();
        System.out.println("Masukan jumlah penjualan Sales hari ini : ");

        int penjualan = input.nextInt();
        int jasa;
        int komisi;
        int total;

        // Kondisi
        if(penjualan <= 200000 ) {
            jasa = 10000;
            komisi = penjualan * 10 / 100;
            total = jasa + komisi;
        } else if (penjualan <= 500000) {
            jasa = 20000;
            komisi = penjualan * 15 / 100;
            total = jasa + komisi;
        } else {
            jasa = 30000;
            komisi = penjualan * 20 / 100;
            total = jasa + komisi;
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Nama Sales " + namaSales );
        System.out.println("Selamat, total penjualan anda hari ini adalah " + penjualan +
                "\nAnda berhak mendapatkan komisi " + komisi + " dan uang jasa " + jasa + "\nTotal pendapatan anda hari ini adalah " + total);
    }
}
