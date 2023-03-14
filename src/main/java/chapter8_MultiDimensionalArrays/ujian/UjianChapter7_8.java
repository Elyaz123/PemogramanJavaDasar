package chapter8_MultiDimensionalArrays.ujian;

import java.util.Scanner;

public class UjianChapter7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*** Aplikasi Pengolahan Nilai Siswa ***");
        System.out.println("=======================================");
        System.out.println(" ");
        System.out.print("Masukan Jumlah Siswa : ");
        int jmlSiswa = input.nextInt();
        System.out.print("Masukan Jumlah Mata Pelajaran yang akan di rekap : ");
        int jmlMapel = input.nextInt();

        String[] namaSiswa = new String[jmlSiswa];
        String[] namaMapel = new String[jmlMapel];

        // Input Nama Mapel
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("Masukan nama mata pelajaran ke " + (i + 1) + " : " );
            namaMapel[i] = input.next();
        }

        double[][] nilaiSiswa = new double[jmlSiswa][jmlMapel];
        double jmlNilai;
        double[] rataRataNilaiSiswa = new double[jmlSiswa];
        char[] indexNilaiSiswa = new char[jmlSiswa];
        String[] keteranganSiswa = new String[jmlSiswa];


        // Input nama siswa dan nilai siswa
        for (int i = 0; i < jmlSiswa; i++) {
            jmlNilai = 0;
            System.out.print("Masukan nama siswa ke " + (i+1) + " : ");
            namaSiswa[i] = input.next();
            for (int j = 0; j < jmlMapel; j++) {
                System.out.print("Masukan nilai mata pelajaran " + namaMapel[j] + " : ");
                nilaiSiswa[i][j] = input.nextDouble();
                jmlNilai += nilaiSiswa[i][j];
            }

            // menghitung rata-rata nilai siswa
            rataRataNilaiSiswa[i] = jmlNilai / jmlMapel;

            // menentukan index nilai siswa
            if (rataRataNilaiSiswa[i] >= 80) {
                indexNilaiSiswa[i] = 'A';
            } else if (rataRataNilaiSiswa[i] >= 70) {
                indexNilaiSiswa[i] = 'B';
            } else if (rataRataNilaiSiswa[i] >= 60) {
                indexNilaiSiswa[i] = 'C';
            } else if (rataRataNilaiSiswa[i] >= 50) {
                indexNilaiSiswa[i] = 'D';
            } else {
                indexNilaiSiswa[i] = 'E';
            }

            // menentukan nilai keterangan siswa
            if (indexNilaiSiswa[i] == 'A') {
                keteranganSiswa[i] = "Lulus dengan baik";
            } else if (indexNilaiSiswa[i] == 'B' || indexNilaiSiswa[i] == 'C') {
                keteranganSiswa[i] = "Lulus";
            } else if (indexNilaiSiswa[i] == 'D') {
                keteranganSiswa[i] = "Lulus dengan pertimbangan";
            } else {
                keteranganSiswa[i] = "Tidak lulus";
            }
        }

        // Menghitung nilai rata-rata, nilai tertinggi dan nilai terendah setiap mapel
        double[] rataRataNilaiMapel = new double[jmlMapel];
        double[] nilaiTertinggi = new double[jmlMapel];
        double[] nilaiTerendah = new double[jmlMapel];
        String[] siswaBerprestasi = new String[jmlMapel];

        for (int i = 0; i < jmlMapel; i++){
            double max = 0, min = 100, jumlahNilaiMapel = 0;
            String namaSiswaBerprestasi = "";
            for (int j = 0; j < jmlSiswa; j++) {
                jumlahNilaiMapel += nilaiSiswa[j][i];

                // mencari nilai tertinggi dan nama siswa berprestasi
                if (nilaiSiswa[j][i] > max) {
                    max = nilaiSiswa[j][i];
                    namaSiswaBerprestasi = namaSiswa[j];
                }

                // mencari nilai terendah
                if (nilaiSiswa[j][i] < min) {
                    min = nilaiSiswa[j][i];
                }
            }
            // input nilai ke setiap mapel
            rataRataNilaiMapel[i] = jumlahNilaiMapel / jmlSiswa;
            nilaiTertinggi[i] = max;
            nilaiTerendah[i] = min;
            siswaBerprestasi[i] = namaSiswaBerprestasi;

        }

        // print data
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println(" ");

        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        // print header
        System.out.format("| %-5s | %-15s | ", "No", "Nama Siswa");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10s | ", namaMapel[i]);
        }
        System.out.format("%-10s | %-5s | %-25s |\n", "Rata-rata", "index", "Keterangan");
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        // print data siswa
        for (int i = 0; i < jmlSiswa; i++) {
            System.out.format("| %-5s | %-15s | ", (i + 1), namaSiswa[i]);
            for (int j = 0; j < jmlMapel; j++) {
                System.out.format("%-10s | ", nilaiSiswa[i][j]);
            }
            System.out.format("%-10.2f | %-5s | %-25s | \n", rataRataNilaiSiswa[i], indexNilaiSiswa[i], keteranganSiswa[i]);
        }
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        // print rata-rata nilai mapel
        System.out.print("Nilai Rata - rata         | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", rataRataNilaiMapel[i]);
        }

        // print nilai tertinggi
        System.out.print("                                               | ");
        System.out.print("\nNilai Tertinggi           | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", nilaiTertinggi[i]);
        }

        // print nilai terendah
        System.out.print("                                               | ");
        System.out.print("\nNilai Terendah            | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", nilaiTerendah[i]);
        }
        System.out.print("                                               | ");

        System.out.print("\n-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        // print siswa berprestasi
        System.out.println("Siswa Berprestasi");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.println((i+1) + ". " + namaMapel[i]  + " = " + siswaBerprestasi[i]);
        }

    }
}
