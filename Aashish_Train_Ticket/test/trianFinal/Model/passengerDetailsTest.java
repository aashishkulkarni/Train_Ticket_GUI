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
public class passengerDetailsTest {
    
    public passengerDetailsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getPassengerName method, of class passengerDetails.
     */
    @Test
    public void testGetPassengerName() {
        System.out.println("getPassengerName");
        passengerDetails instance = new passengerDetails();
        String expResult = "";
        String result = instance.getPassengerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassengerName method, of class passengerDetails.
     */
    @Test
    public void testSetPassengerName() {
        System.out.println("setPassengerName");
        String passengerName = "";
        passengerDetails instance = new passengerDetails();
        instance.setPassengerName(passengerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassengerAge method, of class passengerDetails.
     */
    @Test
    public void testGetPassengerAge() {
        System.out.println("getPassengerAge");
        passengerDetails instance = new passengerDetails();
        int expResult = 0;
        int result = instance.getPassengerAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassengerAge method, of class passengerDetails.
     */
    @Test
    public void testSetPassengerAge() {
        System.out.println("setPassengerAge");
        int passengerAge = 0;
        passengerDetails instance = new passengerDetails();
        instance.setPassengerAge(passengerAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassengerGender method, of class passengerDetails.
     */
    @Test
    public void testGetPassengerGender() {
        System.out.println("getPassengerGender");
        passengerDetails instance = new passengerDetails();
        String expResult = "";
        String result = instance.getPassengerGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassengerGender method, of class passengerDetails.
     */
    @Test
    public void testSetPassengerGender() {
        System.out.println("setPassengerGender");
        String passengerGender = "";
        passengerDetails instance = new passengerDetails();
        instance.setPassengerGender(passengerGender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
