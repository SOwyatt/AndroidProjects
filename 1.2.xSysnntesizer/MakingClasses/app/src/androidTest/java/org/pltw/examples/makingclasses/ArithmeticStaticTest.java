package org.pltw.examples.makingclasses;
import android.provider.MediaStore;

import junit.framework.TestCase;

/**
 *  Created by jeremiahsimmons on 7/28/16.
 */
public class ArithmeticStaticTest extends TestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testAdd() {
        assertEquals(Arithmetic.add(2, 2), 4);
        assertEquals(Arithmetic.add(2, -5), -3);
    }

    public void testSubtract() {
        assertEquals(Arithmetic.subtract(2, 2), 0);
        assertEquals(Arithmetic.subtract(2, -5), 7);
    }

    public void testMultiply() {
        assertEquals(Arithmetic.multiply(2, 2), 4);
        assertEquals(Arithmetic.multiply(2, -5), -10);
    }

    public void testDivide() {
        assertEquals(Arithmetic.divide(2, 2), 1);
        assertEquals(Arithmetic.divide(2, -5), (2 / -5));
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}