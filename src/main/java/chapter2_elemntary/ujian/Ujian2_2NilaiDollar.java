package chapter2_elemntary.ujian;

import java.util.Scanner;

public class Ujian2_2NilaiDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai Rupiah : ");

        int Rupiah = input.nextInt();

        double Dolar = 15665.50;
        double hasil = Rupiah / Dolar;

        System.out.println( Rupiah + " Rupiah adalah = " + hasil + " Dolar");
    }
}
