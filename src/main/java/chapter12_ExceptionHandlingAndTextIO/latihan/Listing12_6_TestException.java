package chapter12_ExceptionHandlingAndTextIO.latihan;

public class Listing12_6_TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace into obtained from getStackTrace");
            StackTraceElement[] traceElements + ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("methode " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }
    private static int sum (int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++)
            result += list[i];
        return result;
    }
}
