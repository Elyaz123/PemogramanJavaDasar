package Soal_Presentasi_MHS.ujian;

public class Kelinci {
    public static void main(String[] args) {

        // Memanggil kelas Hewan
        Hewan kelinci = new Hewan(4);
        kelinci.makan1(); //Method atau tingkah laku hewan kelinci
        kelinci.jalan1();
        kelinci.lari1();

        // Penggunaan fungsi getUmur dari class Hewan
        System.out.println("Umur Kelinci adalah " + kelinci.getUmur() + " tahun");

        // Perhitungan indeks massa tubuh (BMI)
        // Rumus: berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = kelinci.getBerat() / ((kelinci.getTinggi() * 0.01) *
                (kelinci.getTinggi() * 0.01));

        // Hasilnya
        System.out.println("Indeks berat tubuhnya adalah " + bmi);

    }

}
