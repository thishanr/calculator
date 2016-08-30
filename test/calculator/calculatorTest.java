/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DILSHAN
 */
public class calculatorTest {

    public calculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getinstallment method, of class calculator.
     */
    @Test
    public void testGetinstallment() {
        System.out.println("getinstallment");
        double loanAmount = 45541.0;
        int duration = 42;
        double intrestRate = 5.0;
        calculator instance = new calculator();
        double expResult = 423.0;
        double result = instance.getinstallment(loanAmount, duration, intrestRate);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of triple method, of class calculator.
     */
    @Test
    public void testTriple() {
        System.out.println("triple");
        int i = 5;
        calculator instance = new calculator();
        int expResult = 15;
        int result = instance.triple(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}