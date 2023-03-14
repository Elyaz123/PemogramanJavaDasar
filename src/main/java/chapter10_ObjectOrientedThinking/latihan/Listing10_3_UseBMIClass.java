package chapter10_ObjectOrientedThinking.latihan;

public class Listing10_3_UseBMIClass {

    public static void main(String[] args) {
        Listing10_4_BMI  bmi1 = new Listing10_4_BMI ("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());

        Listing10_4_BMI  bmi2 = new Listing10_4_BMI ("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
        + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
