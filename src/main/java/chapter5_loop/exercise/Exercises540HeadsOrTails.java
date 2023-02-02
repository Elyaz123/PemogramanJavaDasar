package chapter5_loop.exercise;

public class Exercises540HeadsOrTails {
    public static void main(String[] args) {
        int heads, tails, coin;
        heads = tails = 0;

        System.out.println("Fipping a coin one millions times..");
        for (int i = 0; i < 1000000; i++) {
            coin = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
        }
        System.out.println(
                "Heads: " + heads +
                        "\nTails: " + tails);
    }
}
