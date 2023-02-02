package chapter6_Methodes.ujian;

import java.util.Scanner;

public class Ujian6_2BangunRuang {
      public static int rusuk, panjang, lebar, tinggi, jari;

        public static void kubus() {
            int luaspermukaan = 0;
            int volume = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Kubus\n");
            System.out.print("Masukan rusuk Kubus: ");
            rusuk = input.nextInt();

            volume = rusuk * rusuk * rusuk;
            System.out.println("Volume Kubus: " + rusuk + " x " + rusuk + " x " + rusuk + " = " + volume);

            luaspermukaan = 6 * rusuk * rusuk;
            System.out.println("Luas permukaan: 6 x (" + rusuk + " x " + rusuk + ") = " + luaspermukaan+
                    "\n--------------------");
        }

        public static void balok() {
            int luaspermukaan = 0;
            int volume = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Balok\n");
            System.out.print("Masukan panjang Balok: ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebar Balok: ");
            lebar = input.nextInt();
            System.out.print("Masukan Tinggi Balok: ");
            tinggi = input.nextInt();

            volume = panjang * lebar * tinggi;
            System.out.println("Volume Balok: " + panjang + " x " + lebar + " x " + tinggi + " = " + volume);

            luaspermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
            System.out.println("Luas Permukaan: 2 x (" + panjang + " x " + lebar + ") + (" + panjang + " x " + tinggi + ") + (" + lebar + " x " + tinggi + ") = " + luaspermukaan +
                    "\n---------------------");
        }
        public static void tabung() {
            double phi = 3.14;
            int a = 2;
            double volume = 0;
            double luasPermukaan = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Tabung\n");
            System.out.print("Masukan jari-jari Tabung: ");
            jari = input.nextInt();
            System.out.print("Masukan Tinggi Tabung: ");
            tinggi = input.nextInt();

            volume = phi * Math.pow(jari, 2) * tinggi;
            System.out.println("Volume Tabung: " +phi + " x " + Math.pow(jari, 2) + " x " + tinggi + " = " + volume);
            luasPermukaan = a * phi * jari * ( jari + tinggi);
            System.out.println("Luas Permukaan: " +a + " x " + phi + " x " + jari + " x (" + jari + " + " + tinggi + ") = " + luasPermukaan +
                    "\n--------------------");

        }

        public static void kerucut() {
            double phi = 3.14;
            double a = 0.33;
            double volume = 0;
            double luasPermukaan = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Kerucut\n");
            System.out.print("Masukan jari-jari Kerucut: ");
            jari = input.nextInt();
            System.out.print("Masukan Tinggi Kerucut: ");
            tinggi = input.nextInt();
            System.out.print("Masukan Sisi Kerucut: ");
            rusuk = input.nextInt();

            volume = a * phi * Math.pow(jari, 2) * tinggi;
            System.out.println("Volume Kerucut: " + a + " x " + phi + " x " + jari + "2 x " + tinggi + " = " + volume);
            luasPermukaan = phi * jari * (jari + rusuk);
            System.out.println("Luas Permukaan: " +phi + " x " + jari + " x (" + jari + " + " + rusuk + ") = " + luasPermukaan +
                    "\n--------------------");

        }

        public static void bola() {
            double phi = 3.14;
            double a = 1.33;
            int b = 4;
            double volume = 0;
            double luasPermukaan = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Bola\n");
            System.out.print("Masukan Diameter: ");
            jari = input.nextInt();

            volume = a * phi * (jari * jari * jari);
            System.out.println("Volume Bola: " + volume );
            luasPermukaan = b * phi * jari * jari;
            System.out.println("Luas Permukaan: " + luasPermukaan +
                    "\n--------------------");
        }



        public static void main(String[] args) {
            int pilih;
            Scanner input = new Scanner(System.in);
            char lagi='Y';

            do{

                System.out.println("Menu Perhitungan\n"+
                        "1. Kubus\n"+
                        "2. Balok\n" +
                        "3. Tabung\n"+
                        "4. Kerucut\n"+
                        "5. Bola\n"+
                        "-----Silahkan pilih menu-----\n");
                System.out.println("");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        kubus(); break;
                    case 2:
                        balok(); break;
                    case 3:
                        tabung(); break;
                    case 4:
                        kerucut(); break;
                    case 5:
                        bola(); break;
                    default:
                        System.out.println("Menu ada 5 pilihan");
                }
                Scanner input1 = new Scanner(System.in);
                System.out.print("Pilih menu lagi [Y/N] ?");
                lagi = input1.next().charAt(0);
            }while (lagi == 'Y');
    }
}
