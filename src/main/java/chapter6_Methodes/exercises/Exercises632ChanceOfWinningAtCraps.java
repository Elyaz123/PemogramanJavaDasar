package chapter6_Methodes.exercises;

public class Exercises632ChanceOfWinningAtCraps {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (playCraps() == 1)
                count++;
        }
        System.out.println("Number of winning games: " + count);
    }

    public static int playCraps(){
        // Roll two dice
        int dice1 = rollDice();
        int dice2 = rollDice();

        printScore(dice1, dice2);

        int point = checkSum(dice1, dice2);
        if (point <= 1) {
            printResult(point);
            return point;
        }

        int sum;
        do {
            // Roll two dice
            dice1 = rollDice();
            dice2 = rollDice();
            sum = dice1 + dice2;
        } while (sum != point && sum != 7);

        printScore(dice1, dice2);

        if (sum == 7) {
            printResult(0);
            point = 0;
        }
        else {
            printResult(1);
            point = 1;
        }
        return point;
    }

    public static int rollDice() {
        // Generate a random number between 1 to 6
        return (int)(1 + Math.random() * 6);
    }

    public static int checkSum(int dice1, int dice2) {
        // If point is 2, 3, or 12 retrun 0 (you lose)
        // if point is 7 or 11 return 1 (you win)
        int sum = dice1 + dice2;
        switch (sum) {
            case 2  :
            case 3  :
            case 12 : return 0;
            case 7  :
            case 11 : return 1;
        }
        return sum;
    }

    public static void printResult(int result) {
        if (result == 0)
            System.out.println("You lose");
        else
            System.out.println("You win");
    }

    public static void printScore(int dice1, int dice2) {
        System.out.println(
                "You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
    }
}
