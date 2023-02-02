package chapter6_Methodes.exercises;

public class Exercises615PrintATaxTable {
    public static void main(String[] args) {
        double from = 50000;
        double to = 60000;
        double interval = 50;

        // Print header
        System.out.println(
                "\nTaxable      Single      Married Joint       Married        Head of\n" +
                        "Income                   or Qualifying       Separate       a House\n" +
                        "                         Widow(er)\n" +
                        "---------------------------------------------------------------------");
        // Print Data
        for (double taxableIncome = from;
             taxableIncome <= to; taxableIncome += interval) {
            System.out.printf("%-13.0f", taxableIncome);
            System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
            System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
            System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
            System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax,
                taxRate,
                incomeTaxed,
                incomeUntaxed,
                taxAt15Pecent,
                taxAt25Pecent,
                taxAt28Pecent,
                taxAt33Pecent,
                taxAt35Pecent;

        taxAt15Pecent = taxAt25Pecent = taxAt28Pecent = taxAt33Pecent =
                taxAt35Pecent = incomeUntaxed = taxRate = tax = 0.0;

        switch (status) {
            case 0 :
                taxAt15Pecent = 8351;
                taxAt25Pecent = 33951;
                taxAt28Pecent = 82251;
                taxAt33Pecent = 171551;
                taxAt35Pecent = 372951; break;

            case 1 :
                taxAt15Pecent = 16701;
                taxAt25Pecent = 67901;
                taxAt28Pecent = 137051;
                taxAt33Pecent = 208851;
                taxAt35Pecent = 372951; break;

            case 2 :
                taxAt15Pecent = 8351;
                taxAt25Pecent = 33951;
                taxAt28Pecent = 68526;
                taxAt33Pecent = 104426;
                taxAt35Pecent = 186476; break;

            case 3 :
                taxAt15Pecent = 11951;
                taxAt25Pecent = 45501;
                taxAt28Pecent = 117451;
                taxAt33Pecent = 190201;
                taxAt35Pecent = 372951;
        }

        // Compute tax
        while (taxableIncome >= taxAt15Pecent) {

            if (taxableIncome >= taxAt35Pecent) {
                taxRate = 0.35;
                incomeUntaxed = taxAt35Pecent - 1;
            }
            else if (taxableIncome >= taxAt33Pecent) {
                taxRate = 0.33;
                incomeUntaxed = taxAt33Pecent - 1;
            }
            else if (taxableIncome >= taxAt28Pecent) {
                taxRate = 0.28;
                incomeUntaxed = taxAt28Pecent - 1;
            }
            else if (taxableIncome >= taxAt25Pecent) {
                taxRate = 0.25;
                incomeUntaxed = taxAt25Pecent -1;
            }
            else if (taxableIncome >= taxAt15Pecent) {
                taxRate = 0.15;
                incomeUntaxed = taxAt15Pecent - 1;
            }

            tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
            taxableIncome -= incomeTaxed;
        }

        return tax += taxableIncome * 0.10;
    }
}
