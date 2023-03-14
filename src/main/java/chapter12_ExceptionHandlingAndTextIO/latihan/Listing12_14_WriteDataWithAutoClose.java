package chapter12_ExceptionHandlingAndTextIO.latihan;

public class Listing12_14_WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("score.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            output.print("Jhon T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
