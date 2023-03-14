package Soal_Presentasi_MHS.ujian;

public class Hewan {
    // Properti
    double tinggi = 20;
    double berat = 4;

    // Inisialisasi properti melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari1() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan1() {
        System.out.println("Berjalan sambil melompat.");
    }

    void makan1() {
        System.out.println("Makan wortel dengan menggunakan mulutnya");
    }

    int getUmur() {
        return umur;
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }
}

