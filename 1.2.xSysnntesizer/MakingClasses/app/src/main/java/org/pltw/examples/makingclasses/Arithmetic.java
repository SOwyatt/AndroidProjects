package org.pltw.examples.makingclasses;

/**
 * Class: Arithmetic: Provides methods to perform arithmetic on numbers
 */
public class Arithmetic {
    //ATTRIBUTES
    private int mOp1;
    private int mOp2;

    // CONSTRUCTORS
    public Arithmetic() {
        mOp1 = 2;
        mOp2 = 3;
    }

    public Arithmetic(int mOp1, int mOp2) {
        this.mOp1 = mOp1;
        this.mOp2 = mOp2;
    }

    //METHODS

    //Integers
    public int add() {
        return mOp1 + mOp2;
    }

    public int subtract() {
        return mOp1 - mOp2;
    }

    public int multiply() {
        return mOp1 * mOp2;
    }

    public int divide() {
        return mOp1 / mOp2;
    }

    //Static Operands

    public static int add(int op1, int op2) {
        return op1 + op2;
    }

    public static int subtract(int op1, int op2) {
        return Arithmetic.add(op1, -op2);
    }

    public static int multiply(int op1, int op2) { // Uses addition
        int total = 0;
        boolean negative = false;
        if(op2 < 0) { // If op2 is negative we need a positive limit for the loop but must retain negativity
            op2 *= -1;
            negative = true;
        }
        for(int i = 0; i < op2; ++i) {
            total += op1;
        }
        return (negative) ? -total : total; // Flips total if op2 was initially negative
    }

    public static int divide(int op1, int op2) {
        return op1/op2; // I tried to make this complicated and use prior methods but it didn't work
    }

    //DEBUG
    public String toString() {
        return "Arithmetic Instance: mOperand1 = " + mOp1 + "; mOperand2 = " + mOp2 + ".";
    }
}
