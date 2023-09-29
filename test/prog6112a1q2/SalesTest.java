/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog6112a1q2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hameed
 */
public class SalesTest {
    
    public SalesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of isValidAmount method, of class Sales.
     */
    @Test
    public void testIsValidAmount() {
        System.out.println("isValidAmount");
        String amount = "2";
        boolean expResult = true;
        boolean result = Sales.isValidAmount(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of containsSpecialChar method, of class Sales.
     */
    @Test
    public void testContainsSpecialChar() {
        System.out.println("containsSpecialChar");
        String amount = "2";
        boolean expResult = true;
        boolean result = Sales.containsSpecialChar(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAllNumbers method, of class Sales.
     */
    @Test
    public void testIsAllNumbers() {
        System.out.println("isAllNumbers");
        String amount = "c";
        boolean expResult = false;
        boolean result = Sales.isAllNumbers(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
