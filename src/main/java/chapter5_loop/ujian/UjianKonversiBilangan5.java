package chapter5_loop.ujian;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UjianKonversiBilangan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Menu Konversion=====");
        System.out.println("1. Binary to Octal");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Binary to Hexadecimal");
        System.out.println("4. Octal to Binary");
        System.out.println("5. Octal to Decimal");
        System.out.println("6. Octal to Hexadecimal");
        System.out.println("7. Decimal to Binary");
        System.out.println("8. Decimal to Octal");
        System.out.println("9. Decimal to Hexadecimal");
        System.out.println("10. Hexadecimal to Binary");
        System.out.println("11. Hexadecimal to Decimal");
        System.out.println("12. Hexadecimal to Octal");
        System.out.println("Please choose menu with number of menu: ");
        int menu = input.nextInt();

        switch (menu) {

            // Convert Binary to Octal
            case 1 -> {
                System.out.println("Binary to Octal");
                System.out.println("Please input Binary number: ");
                int binary = input.nextInt();
                int decimal = 0, i = 0, octal = 0;

                while (binary != 0) {
                    decimal = (int) (decimal + (binary % 10) * Math.pow(2, i));
                    ++i;
                    binary = binary / 10;
                }
                i = 1;
                while (decimal != 0) {
                    octal = octal + (decimal % 8) * i;
                    decimal = decimal / 8;
                    i = i * 10;
                }
                System.out.println("value of " + binary + " in Binary is a " + octal + " in Octal");
            }

            //Convert Binary to Decimal
            case 2 -> {
                System.out.println("Binary to Decimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int digit, decimal = 0, i = 1;
                while (binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                System.out.println("value of " + binary + " in Binary is a " + decimal + " in Decimal");
            }

            //Convert Binary to Hexadecimal
            case 3 -> {
                System.out.println("Binary to Hexadecimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int binInput = binary;
                int digit, decimal = 0, i = 1;
                while (binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (decimal > 0) {
                    long rem = decimal % 16;
                    hex = hexChars[(int) rem] + hex;
                    decimal = decimal / 16;
                }
                System.out.println("value of " + binInput + " in Binary is a " + hex + " in Hexadecimal");
            }

            //Convert Octal to Binary
            case 4 -> {
                System.out.println("Octal to Binary");
                System.out.println("Please input Octal number: ");
                int Octal = input.nextInt();
                int i, j, octnum, decimal = 0;
                int Binary = 0;
                i = 0;
                octnum = Octal;

                while (Octal != 0) {
                    decimal = (int) (decimal + (Octal % 10) * Math.pow(8, i));
                    ++i;
                    Octal = Octal / 10;
                }
                j = 1;
                while (decimal != 0) {
                    Binary = Binary + (decimal % 2) * j;
                    decimal = decimal / 2;
                    j = j * 10;
                }
                System.out.println("Value of " + octnum + " in Octal is a " + Binary + " in Binary");
            }

            //Convert Octal to decimal
            case 5 -> {
                System.out.println("Octal to decimal");
                long octnum, octal, decnum = 0;
                int i = 0;
                System.out.print("Please input Octal number : ");
                octnum = input.nextLong();
                octal = octnum;
                while (octnum != 0)
                {
                    decnum = (long)(decnum + (octnum % 10) * Math.pow(8, i++));
                    octnum = octnum /10;
                }
                System.out.println("Value is " + octal + " in Octal is " + decnum + " in Decimal");

            }
            //Convert Octal to hexadecimal
            case 6 -> {
                System.out.println("Octal to Hexadecimal");
                System.out.println("Please input Octal number: ");
                String hexnum;
                Scanner scan = new Scanner(System.in);
                int octnum = input.nextInt();

                int decnum = Integer.parseInt(String.valueOf(octnum), 8);
                hexnum = Integer.toHexString(decnum);

                System.out.println("value of " + octnum + " in Octal is a " + hexnum + " in Hexadecimal");

            }

            //Convert Decimal to Binary
            case 7 -> {
                System.out.println("Decimal to Binary");
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input Decimal number: ");
                int n = sc.nextInt();
                int bin[]=new int[100];
                long dec;
                int i = 0;
                dec = n;

                while (n > 0)
                {
                    bin[i++] = n%2;
                    n = n/2;
                }
                System.out.print("Value of " + dec + " in Decimal is a ");
                for(int j = i-1;j >= 0;j--)
                {
                    System.out.print(bin[j]);
                }
                System.out.print(" in Binary");
            }

            //Convert Decimal to Octal
            case 8 -> {
                System.out.println("Decimal to Octal");

                int dec, rem, i=0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input Decimal number: ");
                dec=sc.nextInt();
                System.out.print("Value of " + dec + " in Decimal is a ");
                int a[] = new int[50];
                while(dec!= 0)
                {
                    a[i++] = dec%8;
                    dec= dec/8;
                }
                for (int c = i;c>=0;c--)
                {
                    System.out.print(a[c]);
                }
                System.out.print(" in Octal");
            }

            //Convert Decimal to Hexadecimal
            case 9 -> {
                System.out.println("Decimal to Hexadecimal");
                System.out.print("Please input Decimal number: ");
                int num = input.nextInt();
                long dec;
                int rem;
                String str2="";
                dec = num;

                char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};

                while (num>0)
                {
                    rem=num%16;
                    str2=hex[rem]+str2;
                    num=num/16;
                }
                System.out.println("Value is " + dec + " in Decimal is a " + str2 + " in Hexadecimal");

            }
            // Convert Hexadecimal to Binary
            case 10 -> {
                System.out.println("Hexadecimal to Binary");
                int i=0, len;
                String hexadecimal;

                Scanner s = new Scanner(System.in);

                System.out.print("Please input Alphabet Hexadecimal: ");
                hexadecimal = s.nextLine();

                len = hexadecimal.length();
                char[] hexDigit = hexadecimal.toCharArray();

                System.out.print("Value is " + hexadecimal + " in Hexadecimal is a ");
                while (i<len)
                {
                    switch (hexDigit[i])
                    {
                        case '0':
                            System.out.print("0000"); break;
                        case '1':
                            System.out.print("0001"); break;
                        case '2':
                            System.out.print("0010"); break;
                        case '3':
                            System.out.print("0011"); break;
                        case '4':
                            System.out.print("0100"); break;
                        case '5':
                            System.out.print("0101"); break;
                        case '6':
                            System.out.print("0110"); break;
                        case '7':
                            System.out.print("0111"); break;
                        case '8':
                            System.out.print("1000"); break;
                        case '9':
                            System.out.print("1001"); break;
                        case 'A':
                        case 'a':
                            System.out.print("1010"); break;
                        case 'B':
                        case 'b':
                            System.out.print("1011"); break;
                        case 'C':
                        case 'c':
                            System.out.print("1100"); break;
                        case 'D':
                        case 'd':
                            System.out.print("1101"); break;
                        case 'E':
                        case 'e':
                            System.out.print("1110"); break;
                        case 'F':
                        case 'f':
                            System.out.print("1111"); break;
                        default:
                            System.out.println("Invalid Hexadecimal digit!");
                            return;
                    }
                    i++;
                }
                System.out.print(" in Binary");
            }
            // Convert to Hexadecimal to Decimal
            case 11 -> {
                System.out.println("Hexadecimal to decimal");
                int decimal =0, i=0, len,rem;
                String hexadecimal;

                Scanner s = new Scanner(System.in);

                System.out.print("Please input Alphabet Hexadecimal: ");
                hexadecimal = s.nextLine();

                len =  hexadecimal.length();

                len--;
                while (len>=0) {
                    rem = hexadecimal.charAt(len);
                    if (rem > 48 && rem <= 57)
                        rem = rem - 48;
                    else if (rem >= 65 && rem <= 70)
                        rem = rem - 55;
                    else if (rem >= 97 && rem <= 102)
                        rem = rem - 87;
                    else {
                        System.out.println("\ninvalid hexadecimal digit!");
                    }
                    decimal = (int) (decimal + (rem * Math.pow(16, i)));
                    i++;
                    len--;
                }
                System.out.println("Value is " + hexadecimal + " in Hexadecimal is a " + decimal + " in Decimal");
            }


            //Convert to Hexadecimal to Octal
            case 12 -> {
                System.out.println("Hexadecimal to Octal");
                {
                    int decimal=0, rem, i=0, len;
                    String hexadecimal;
                    int[] octal = new int[20];

                    Scanner s = new Scanner(System.in);

                    System.out.print("Please input Alphabet Hexadecimal : ");
                    hexadecimal = s.nextLine();

                    len = hexadecimal.length();
                    len--;

                    while(len>=0)
                    {
                        rem = hexadecimal.charAt(len);
                        if(rem>=48 && rem<=57)
                            rem = rem-48;
                        else if(rem>=65 && rem<=70)
                            rem = rem-55;
                        else if(rem>=97 && rem<=102)
                            rem = rem-87;
                        else
                        {
                            System.out.println("\nInvalid Hexadecimal Digit!");
                            return;
                        }
                        decimal = (int) (decimal + (rem*Math.pow(16, i)));
                        i++;
                        len--;
                    }

                    i=0;
                    while(decimal!=0)
                    {
                        octal[i] = decimal%8;
                        i++;
                        decimal = decimal/8;
                    }

                    System.out.print("Value is " + hexadecimal + " in Hexadecimal is a ");
                    for(i=(i-1); i>=0; i--)
                        System.out.print(octal[i]);
                        System.out.print(" in Octal");
                }
            }

            default -> {
                System.out.println("Sorry,your choose in wrong");
            }
        }

    }
}