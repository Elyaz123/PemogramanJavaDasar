package chapter7_Array.exercise;

public class Exercises729_PickYourCards {
    public static void main(String[] args) {
        int[] deck;

        do {
            deck = new int[52];

            pickFourCards(deck);
        } while (sum(deck) != 24);

        print(deck);

    }

    public static void pickFourCards(int[] deck) {
        for (int i = 0; i < 4; i++) {
            deck[(int)(Math.random() * 52)]++;
        }
    }

    public static int sum(int[] deck) {
        int sum = 0;
        for (int i = 0; i < deck.length; i++)  {
            sum += ((i + 1) % 13) * deck[i];
        }
        return  sum;
    }

    public static void print(int [] deck) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        System.out.print("The number of picks that yields the sum of 24: ");
        for (int i= 0; i < deck.length; i++) {
            if (deck[i] > 0)
                System.out.print(ranks[i % 13] + " ");
        }
        System.out.println();
    }
}
