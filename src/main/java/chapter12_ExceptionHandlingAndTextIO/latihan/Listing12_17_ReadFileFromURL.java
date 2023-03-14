package chapter12_ExceptionHandlingAndTextIO.latihan;

import java.util.Scanner;

public class Listing12_17_ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            java.net.URL url1 = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url1.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) {
            System.out.println("I / O Errors: no such file");
        }
    }
}
