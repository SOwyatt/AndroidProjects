package org.pltw.examples.makingclasses;

import junit.framework.TestCase;

public class ArithmeticTaxTest extends TestCase {
    TaxArithmetic ta;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ta = new TaxArithmetic(25, 10);
    }

    public void testArithmeticAdd() {
        assertEquals(ta.add(), 35);
    }

    public void testArithmeticSubtract() {
        assertEquals(ta.subtract(), 15);
    }

    public void testArithmeticMultiply() {
        assertEquals(ta.multiply(), 250);
    }

    public void testArithmeticDivide() {
        assertEquals(ta.divide(), (25 / 10));
    }

    public void testArithmeticTax() {
        assertEquals(ta.calculateTax(7.0), 2.45);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

}
