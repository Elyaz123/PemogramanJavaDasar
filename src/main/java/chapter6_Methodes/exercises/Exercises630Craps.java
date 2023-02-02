package chapter6_Methodes.exercises;

public class Exercises630Craps {
    public static void main(String[] args) {
        int point = rollTwoDice();

        int result = getresult(point);

        if (isNaturalOrCraps(result))
            printResult(result);
        else {
            rollTillWinOrLose(result);
        }
    }

    public static int rollDice() {
        return (int)(1 + Math.random() * 6);
    }

    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

    public static int getresult(int point) {
        switch (point) {
            case 2  :
            case 3  :
            case 12 : point = 0; break;
            case 7  :
            case 11 : point = 1; break;
        }
        return point;
    }

    public static void printResult(int result) {
        if (result == 0)
            System.out.println("You lose");
        else if (result == 1)
            System.out.println("You win");
    }

    public static boolean isNaturalOrCraps(int result) {
        return result == 0 || result == 1;
    }

    public static void rollTillWinOrLose(int point) {
        int result;

        do {
            result = rollTwoDice();
        } while (result != point && result != 7);

        if (result == 7)
            printResult(0);
        else
            printResult(1);
    }
}
