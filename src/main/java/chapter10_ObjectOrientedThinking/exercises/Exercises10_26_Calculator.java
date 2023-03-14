package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_26_Calculator {
    public static void main(String[] args) {

        String a = args[0].replaceAll(" ","");
        a = a.replaceAll("[+]","#+#");
        a = a.replaceAll("[-]","#-#");
        a = a.replaceAll("[*]","#*#");
        a = a.replaceAll("[/]","#/#");
        args = a.split("#");

        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+' : result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' : result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' : result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}
