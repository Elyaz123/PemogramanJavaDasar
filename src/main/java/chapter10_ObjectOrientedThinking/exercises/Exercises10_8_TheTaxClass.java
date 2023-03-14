package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_8_TheTaxClass {
    public static void main(String[] args) {
        Tax tax2001 = new Tax();
        Tax tax2009 = new Tax();

        double[] rates2001 = {15, 27.5, 30.5, 39.1};
        tax2001.setRates(rates2001);

        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };
        tax2001.setBrackets(brackets2001);

        final double FROM = 50000;
        final double TO = 60000;
        final double INTERVAL = 1000;

        System.out.println(
                "\n2001 tax tables for taxable income from $50,000 to $60,000");
        print(tax2001, FROM, TO, INTERVAL);

        System.out.println(
                "\n2009 tax tables for taxable income from $50,000 to $60,000");
        print(tax2009, FROM, TO, INTERVAL);

        }

        public static void print(Tax tax, double from, double to, double interval) {
            System.out.println(
                    "-------------------------------------------------------------------\n" +
                            "Taxable       Single       Married Joint      married      Head os\n" +
                            "Income          or Qualifying           Separate           a House\n" +
                            "---------------------------------------------------------------------"
            );
            for (double taxableIncome = from;
            taxableIncome <= to; taxableIncome += interval) {
                tax.setTaxableIncome(taxableIncome);
                System.out.printf("%-13.0f", taxableIncome);
                tax.setFillingStatus(tax.SINGLE_FILER);
                System.out.printf("%8.2f", tax.getTax());

                tax.setFillingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
                System.out.printf("%15.2f", tax.getTax());
                tax.setFillingStatus(tax.MARRIED_SEPARATELY);
                System.out.printf("%18.2f", tax.getTax());
                tax.setFillingStatus(tax.HEAD_OF_HOUSEHOLD);
                System.out.printf("%15.2f\n", tax.getTax());
            }
        }
}

class Tax {

    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    Tax() {
        filingStatus = SINGLE_FILER;

        double[] currentYearRates = {10, 15, 25, 28, 33, 35};
        ;
        setRates(currentYearRates);

        int[][] currentYearBrackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        setBrackets(currentYearBrackets);

        taxableIncome = 0;

    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j = 0; j < brackets[i].length; j++)
                this.brackets[i][j] = brackets[i][j];
        }
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++)
            this.rates[i] = rates[i] / 100;
    }

    public double[] getRates() {
        return rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0, incomeTaxed = 0;
        double income = taxableIncome;
        if (rates.length >= 2) {
            for (int i = rates.length - 2; i >= 0; i--) {
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTaxed = income - brackets[filingStatus][i])
                            * rates[i + 1];
                    income -= incomeTaxed;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }

    public void setFillingStatus(int singleFiler) {
    }
}

