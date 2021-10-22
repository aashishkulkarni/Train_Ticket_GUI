/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianFinal.Model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aashish Kulkarni
 */
public class medicalDetailsTest {
    
    public medicalDetailsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of med1 method, of class medicalDetails.
     */
    @Test
    public void testMed1() {
        System.out.println("med1");
        medicalDetails instance = new medicalDetails();
        instance.med1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of med2 method, of class medicalDetails.
     */
    @Test
    public void testMed2() {
        System.out.println("med2");
        medicalDetails instance = new medicalDetails();
        instance.med2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of med3 method, of class medicalDetails.
     */
    @Test
    public void testMed3() {
        System.out.println("med3");
        medicalDetails instance = new medicalDetails();
        instance.med3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class medicalDetails.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        medicalDetails instance = new medicalDetails();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositive method, of class medicalDetails.
     */
    @Test
    public void testGetPositive() {
        System.out.println("getPositive");
        medicalDetails instance = new medicalDetails();
        String expResult = "";
        String result = instance.getPositive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPositive method, of class medicalDetails.
     */
    @Test
    public void testSetPositive() {
        System.out.println("setPositive");
        String positive = "";
        medicalDetails instance = new medicalDetails();
        instance.setPositive(positive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVaccine method, of class medicalDetails.
     */
    @Test
    public void testGetVaccine() {
        System.out.println("getVaccine");
        medicalDetails instance = new medicalDetails();
        String expResult = "";
        String result = instance.getVaccine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVaccine method, of class medicalDetails.
     */
    @Test
    public void testSetVaccine() {
        System.out.println("setVaccine");
        String vaccine = "";
        medicalDetails instance = new medicalDetails();
        instance.setVaccine(vaccine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsolation method, of class medicalDetails.
     */
    @Test
    public void testGetIsolation() {
        System.out.println("getIsolation");
        medicalDetails instance = new medicalDetails();
        String expResult = "";
        String result = instance.getIsolation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsolation method, of class medicalDetails.
     */
    @Test
    public void testSetIsolation() {
        System.out.println("setIsolation");
        String isolation = "";
        medicalDetails instance = new medicalDetails();
        instance.setIsolation(isolation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
