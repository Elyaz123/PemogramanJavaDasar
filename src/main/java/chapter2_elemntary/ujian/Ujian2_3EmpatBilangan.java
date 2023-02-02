package chapter2_elemntary.ujian;

import java.util.Scanner;

public class Ujian2_3EmpatBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1.000 and 9.999 : ");
        int bilangan = input.nextInt();

        int satuan = bilangan % 10;
        int puluhan = (bilangan / 10) % 10;
        int ratusan = (bilangan / 100) % 10;
        int ribuan = (bilangan / 1000) % 10;

        int Total = satuan + puluhan + ratusan + ribuan ;

        System.out.println("Jumlah dari ke empat bilangan tersebut adalah " + Total );
    }
}
