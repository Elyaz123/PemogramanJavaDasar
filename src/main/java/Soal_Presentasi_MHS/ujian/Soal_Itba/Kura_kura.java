package Soal_Presentasi_MHS.ujian.Soal_Itba;

public class Kura_kura {
    public static void main(String[] args) {

        Hewan3 Kura_kura = new Hewan3(5);
        Kura_kura.makan();
        Kura_kura.lari();
        Kura_kura.jenis();

        System.out.println("Umur Kura-kura adalah " + Kura_kura.getUmur() + " tahun");

         double bmi = Kura_kura.getBerat() / ((Kura_kura.getTinggi() * 0.01) * (Kura_kura.getTinggi() * 0.01));

        System.out.println("Masa tubuhnya adalah " + bmi);
    }
}
