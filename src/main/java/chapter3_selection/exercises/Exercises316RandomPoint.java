package chapter3_selection.exercises;

public class Exercises316RandomPoint {
    public static void main(String[] args) {
        // Generate random widht and height
        int widht = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);

        // Display coordinate
        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("with widht 100 and height 200: (" + widht + ", " + height + ")");
    }
}

