package chapter1_intro.exercise;

public class Exercises17ApproximatePhi {
    public static void main(String[] args) {
        double a = 4 *( 1 - (1.0/3) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11));
        double n = 4 *( 1 - (1.0/3) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11) + (1.0/13));

        System.out.println("hasil dari a = 4 * ( 1 - (1/3) + (1/5) + (1/7) + (1/9) + (1/11) Hasilnya adalah = " + a);
        System.out.println("hasil dari n = 4 * ( 1 - (1/3) + (1/5) + (1/7) + (1/9) + (1/11) + (1/13) = " + n );
    }
}
