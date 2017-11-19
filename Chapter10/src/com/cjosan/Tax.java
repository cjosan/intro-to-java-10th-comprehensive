package com.cjosan;

/**
 * Created by admin on 18.06.2017.
 */
public class Tax {
    public final static int SINGLE_FILER = 0;
    public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public final static int MARRIED_SEPARATELY = 2;
    public final static int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double getTax() {
        int index = 0;
        for (int i = 0; i < brackets[filingStatus].length; i++) {
            if (taxableIncome <= brackets[filingStatus][i]) {
                index = i;
                break;
            }
        }

        if (taxableIncome <= brackets[filingStatus][0]) {
            double tax = taxableIncome * rates[0];
            return tax;
        }

        double tax = brackets[filingStatus][0] * rates[0];
        for (int i = 1; i < index; i++) {
            tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
        }
        tax += (taxableIncome - brackets[filingStatus][index - 1]) * rates[index];

        return tax;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
