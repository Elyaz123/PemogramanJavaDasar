package Soal_Presentasi_MHS.ujian.Soal_Itba;

public class Hewan3 {
    double tinggi = 8;
    double berat = 5;

    int umur;

    Hewan3(int umur) {this.umur = umur; }

    void lari() {
        System.out.println("Larinya sangat lambat"); }
    void makan() {
        System.out.println("Makannya ikan kecil"); }
    void jenis() {
        System.out.println("Termasuk dalam Karnivora"); }

    int getUmur() {return umur; }
    double getTinggi() {return tinggi; }
    double getBerat() {return berat; }
    }

