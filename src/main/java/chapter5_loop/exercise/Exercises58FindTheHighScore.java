package chapter5_loop.exercise;

import java.util.Scanner;

public class Exercises58FindTheHighScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestscore = 0;
        String highestScoeName = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student's name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("" +
                    "Student: " + (i + 1) +
                    "\n   Name: ");
            String name = input.next();
            System.out.print("" +
                    "    Score: ");
            int score = input.nextInt();

            if (score > highestscore)
            {
                highestscore = score;
                highestScoeName = name;
            }

        }
        System.out.println("Student with the higest score: " + highestScoeName);
    }
}
