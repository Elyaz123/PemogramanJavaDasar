package chapter6_Methodes.exercises;

public class Exercises611ComputeCommissions {
    public static void main(String[] args) {
        System.out.println("\n SalesAmount     Commission");
        System.out.println("-----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computeCommission(salesAmount));
        }
    }
    public  static double computeCommission(double salesAmount) {
        double balance,
                commissin;
        balance = commissin = 0.0;

        if (salesAmount >= 10000.01)
            commissin += (balance = balance - 10000) * 0.12;

        if (salesAmount >= 5000.01)
            commissin += (balance -= balance - 5000) * 0.10;

        if (salesAmount >= 0.01)
            commissin += balance * 0.08;

        return  commissin;
    }
}
