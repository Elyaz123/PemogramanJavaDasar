package chapter3_selection.ujian;

import java.util.Scanner;

public class Ujian3_2TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama bulan dalam bahasa Indonesia: ");
        String bulan = input.next();
        System.out.println("Masukan Tahun: ");
        int tahun = input.nextInt();
        boolean tahunKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        switch (bulan) {
            case "Januari":
                System.out.println("Pada bulan Januari tahun " + tahun + " ada 31 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat" : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Februari":
                System.out.println("Pada bulan Februari tahun " + tahun + " ada " + ((tahunKabisat) ? "29 hari,\nTahun ini merupakan tahun kabisat " : "28 hari,\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Maret":
                System.out.println("Pada bulan Maret tahun " + tahun + " ada 31 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat "));
                break;
            case "Juni":
                System.out.println("Pada bulan April tahun " + tahun + " ada 30 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Juli":
                System.out.println("Pada bulan Juli tahun " + tahun + " ada 31 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Agustus":
                System.out.println("Pada bulan Agustus tahun " + tahun + " ada 31 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "September":
                System.out.println("Pada bulan September tahun " + tahun + "ada 30 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Oktober":
                System.out.println("Pada bulan Oktober tahun " + tahun + " ada 31 hari" + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "November":
                System.out.println("Pada bulan November tahun " + tahun + "ada 30 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));
                break;
            case "Desember":
                System.out.println("Pada bulan Desember tahun " + tahun + " ada 31 hari," + ((tahunKabisat) ? "\nTahun ini merupakan tahun kabisat " : "\nTahun ini bukan merupakan tahun kabisat"));

        }
    }
}
