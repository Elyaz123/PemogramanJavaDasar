package chapter3_selection.ujian;

import java.util.Objects;
import java.util.Scanner;

public class Ujian3_4ProgramKasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah anda termasuk member? (Ya/Tidak)");
        String member1 = input.next();

        System.out.println("Masukan Total belanja:");
        int total = input.nextInt();

        //Kondisi
        if (Objects.equals(member1, "Ya")) {
            System.out.println("Anda merupakan : Member");
        } else if (Objects.equals(member1, "Tidak")) {
            System.out.println("Anda merupakan: Pelanggan biasa");
        } else {
            System.out.println("Mohon maaf masukan Ya/Tidak");
        }

        System.out.println("Total belanja anda: " + total);

        double diskon = 0;

        //Diskon
        if (Objects.equals(member1, "Ya")) {
            if (total >= 500000) {
                diskon = total * 3 / 100;
                System.out.println("Selamat anda mendapatkan potongan harga " + diskon);
            } else if (total < 500000) {
                diskon = total * 2 / 100;
                System.out.println("Selamat anda mendapatkan potongan harga " + diskon);
            }
        } else if (Objects.equals(member1, "Tidak")) {
            if (total >= 500000) {
                diskon = total * 2 / 100;
                System.out.println("Selamat anda mendapatkan potongan harga " + diskon);
            } else if (total < 500000) {
                diskon = total * 0 / 100;
            }
        }

        //Diskon
        double totalBayar = total - diskon;
        System.out.println("Total Bayar: " + totalBayar);

        System.out.println();
        System.out.println("******* CASH SYSTEM ******");

        System.out.println("Total Cash: ");
        int totalCash = input.nextInt();

        double kembalian = totalCash - totalBayar;

        //Kondisi
        if (totalCash >= total) {
            System.out.println("Kembalian Anda: " + kembalian);
        } else if (totalCash <= total) {
            System.out.println("Maaf Jumlah yang anda bayarkan kurang");
        }
    }
}
