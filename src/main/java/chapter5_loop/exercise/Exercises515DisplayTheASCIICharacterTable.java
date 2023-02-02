package chapter5_loop.exercise;

public class Exercises515DisplayTheASCIICharacterTable {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARACTER_PER_LINE = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            count++;

            if (count % 10 == 0)
                System.out.println((char)i);
            else
                System.out.println((char)i + " ");
        }
        System.out.println();
    }
}
