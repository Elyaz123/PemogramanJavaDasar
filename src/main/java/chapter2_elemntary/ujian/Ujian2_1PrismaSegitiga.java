package chapter2_elemntary.ujian;

import java.util.Scanner;

public class Ujian2_1PrismaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Alas segitiga: ");
        double as = input.nextDouble();

        System.out.print("Tinggi segitiga: ");
        double ts = input.nextDouble();

        System.out.print("Tinggi prisma: ");
        double tp = input.nextDouble();

        double a = as / 2;
        double b =(Math.pow(a ,2));
        double c =(Math.pow(ts, 2));
        double d = b + c;
        double e = 2 * (Math.pow(d, 0.5)) + as;

        double ks = e;
        double Volume = (0.5 * as * ts) * tp;
        double LP = (2 * 0.5 * as * ts) + (ks * tp);

        System.out.println("Luas permukaan prisma segitiga adalah " + LP + " dan Volume prisma segitiga adalah " + Volume );
    }
}
