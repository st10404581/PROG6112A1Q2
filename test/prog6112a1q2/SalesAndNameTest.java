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
public class SalesAndNameTest {
    
    public SalesAndNameTest() {
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
     * Test of containsOnlyLetters method, of class SalesAndName.
     */
    @Test
    public void testContainsOnlyLetters() {
        System.out.println("containsOnlyLetters");
        String name = "Albert";
        boolean expResult = true;
        boolean result = SalesAndName.containsOnlyLetters(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of containsSpecialChar method, of class SalesAndName.
     */
    @Test
    public void testContainsSpecialChar() {
        System.out.println("containsSpecialChar");
        String name = "Alb3rt@";
        boolean expResult = false;
        boolean result = SalesAndName.containsSpecialChar(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
