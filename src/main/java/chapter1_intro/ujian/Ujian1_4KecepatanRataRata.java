package chapter1_intro.ujian;

public class Ujian1_4KecepatanRataRata {
    public static void main(String[] args) {
        double km = 50 /(2 + (30 / 60.0) + (45 / 3600.0)) * 1.6;

        System.out.println("Miles/(Hour+(minutes/60)+(second/3600)) * 1.6");
        System.out.println("50   /(2   +(30     /60)+(45    /3600)) * 1.6");
        System.out.printf("Kecepatan rata-rata dalam kilometer per jam adalah " + km + " km/jam");

    }
}
