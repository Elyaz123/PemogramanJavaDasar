package chapter4_math.exercise;

public class Exercises425GenerateVehilePlateNumbers {
    public static void main(String[] args) {
        // Generate three random upppercase letters
        int letter1 = 65 + (int)(Math.random() * (90 - 65));
        int letter2 = 65 + (int)(Math.random() * (90 - 65));
        int letter3 = 65 + (int)(Math.random() * (90 - 65));

        // Generate four ramdom digits
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);

        // Display number palte
        System.out.println("" + (char)(letter1) + ((char)(letter2)) + ((char)(letter3)) + number1 + number2 + number3 + number4);
    }
}
