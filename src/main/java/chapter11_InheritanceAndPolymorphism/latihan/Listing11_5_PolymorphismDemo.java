package chapter11_InheritanceAndPolymorphism.latihan;

public class Listing11_5_PolymorphismDemo {
    public static void main(String[] args) {

        displayObject(new Listing11_2_Circle(1, "red", false));
        displayObject(new Listing11_3_Rectangle(1, 1, "black", true));
    }

    public static void displayObject(Listing11_1_GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
