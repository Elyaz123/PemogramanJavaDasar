package Soal_Presentasi_MHS.ujian.Soal_Galuh.Abtraksi;

import java.util.Calendar;

abstract class Manusia {
    private String namaLengkap;
    private int tahunLahir;

    public Manusia(String namaLengkap, int tahunLahir) {
        this.namaLengkap = namaLengkap;
        this.tahunLahir = tahunLahir;
    }

    protected String getNamaLengkap() {
        return namaLengkap;
    }

    protected int getUmur() {
        Calendar cal = Calendar.getInstance();

        int tahunSekarang = cal.get(Calendar.YEAR);

        return tahunSekarang - tahunLahir;
    }

    public abstract void menyapa();
}

class Paijo extends Manusia{
    public Paijo(String namaLengkap, int tahunLahir) {
        super(namaLengkap, tahunLahir);
    }

    @Override
    public void menyapa() {
        System.out.println("Sugeng Rawuh, nama Lengkapku " + getNamaLengkap() +
                " , umurku " + getUmur() + " tahun");
    }
}

class Ratna extends Manusia {
    public Ratna(String namaLengkap, int tahunLahir) {
        super(namaLengkap, tahunLahir);
    }

    @Override
    public void menyapa() {
        System.out.println("Sugeng Rawuh, nama Lengkapku " + getNamaLengkap() +
                " , umurku " + getUmur() + " tahun");
    }
}

class MainAbstraksi {
    public static void main(String[] args) {
        Paijo paijo = new Paijo("Paijo kusyono", 1995);
        Ratna ratna = new Ratna("Ratna trumpret", 1987);

        paijo.menyapa();
        ratna.menyapa();
    }
}


