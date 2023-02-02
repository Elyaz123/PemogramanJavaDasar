package chapter3_selection.ujian;

import java.util.Objects;
import java.util.Scanner;

public class Ujian3_1PerhitunganBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan jenis kelamin anda : ");
        String jk = input.next();

        System.out.println("Inputkan Tinggi badan anda dalam cm : ");
        double tinggibadan = input.nextDouble();
        System.out.println("Inputkan Berat badan anda dalam kg : ");
        double beratbadan = input.nextDouble();

        double berat_ideal = 0;



        // Rumus Bocha
        if (Objects.equals(jk, "L")) {
            jk = "Laki-laki";
            berat_ideal = (tinggibadan - 100) - (0.1 * (tinggibadan - 100));
        } else if (Objects.equals(jk, "P")) {
            jk = "Perempuan";
            berat_ideal = (tinggibadan - 100) - (0.15 * (tinggibadan - 100));
        } else {
            System.out.println("Mohon maaf masukan jenis kelamin dengan L/P ");
        }

        // Rumus BIM
        double tinggidalamCm = tinggibadan / 100;
        double bmi = beratbadan / (Math.pow(tinggidalamCm, 2));

        String keterangan;
        if (bmi < 18.5) {
            keterangan = " Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            keterangan = " Ideal";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            keterangan = " kelebihan berat badan";
        } else {
            keterangan = " Obesitas";
        }

        System.out.println("Jenis kelamin anda adalah " + jk + ", maka berat badan ideal anda " + berat_ideal + " kg");
        System.out.println("Nilai BMI tubuh anda adalah " + String.format("%.2f", bmi) + " maka berat badan anda termasuk kategoti" + keterangan);
    }
}
