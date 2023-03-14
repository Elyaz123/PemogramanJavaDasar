package Soal_Presentasi_MHS.ujian.Soal_Itba;

public class car {
    String merk;
    int price;
    String color;

};

class indetitas12{
    public static void main(String[] args) {

        car carRush = new car();
        car carAlpart = new car();

        carRush.merk = "Rush";
        carRush.price = 80;
        carRush.color = "Yellow";

        carAlpart.merk = "Alpart";
        carAlpart.price = 200;
        carAlpart.color = "Red";

        System.out.println(carRush.merk);
        System.out.println(carRush.price + " Juta");
        System.out.println(carRush.color + "\n");
        System.out.println(carAlpart.merk);
        System.out.println(carAlpart.price + " Juta");
        System.out.println(carAlpart.color + "\n");

    }
}
