package org.pltw.examples.makingclasses;

public class TaxArithmetic extends Arithmetic {

    public TaxArithmetic(int mOp1, int mOp2) {
        super(mOp1, mOp2);
    }

    public double calculateTax(double amount, double taxRate) {
        return amount * (taxRate / 100); // taxRate is a double in % form, /100 converts it a decimal form
    }

    public double calculateTax(double taxRate) {
        return this.calculateTax(this.add(), taxRate);
    }
}
