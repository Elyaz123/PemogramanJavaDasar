package Chapter9_ObjectsAndClasses.exercises;

public class Exercises94_UseTheRandomClass {
    public static void main(String[] args) {
        java.util.Random randomNumber = new java.util.Random(1000);

        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0)
                System.out.printf("%5d\n", randomNumber.nextInt(100));
            else
            System.out.printf("%5d\n", randomNumber.nextInt(100));
        }
    }
}
