package org.pltw.examples.makingclasses;
import junit.framework.TestCase;

/**
 *  Created by jeremiahsimmons on 7/28/16.
 */
public class ArithmeticTest2 extends TestCase {
    private Arithmetic testArithmetic;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        testArithmetic = new Arithmetic(25, 10);
    }
    public void testArithmeticAdd() throws Exception {
        assertEquals(testArithmetic.add(), 35);
    }
    public void testArithmeticSubtract() throws Exception {
        assertEquals(testArithmetic.subtract(), 15);
    }
    public void testArithmeticMultiply() throws Exception {
        assertEquals(testArithmetic.multiply(), 250);
    }
    public void testArithmeticDivide() throws Exception {
        assertEquals(testArithmetic.divide(), 2);
    }
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}