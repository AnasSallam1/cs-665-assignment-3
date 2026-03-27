/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/26/2026
 * File Name: TestApp.java
 * Description: Unit tests to verify correct email generation for all 5 segments.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.CustomerFactory;
import edu.bu.met.cs665.models.Customer;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Unit tests for the application.
 */
public class TestApp {

    /**
     * Test 1: Tests the Factory to ensure it generates the correct email
     * for the right Customer.
     */
    @Test
    public void testAllCustomerTypes() {
        String[] types = {"BUSINESS", "RETURNING", "FREQUENT", "NEW", "VIP"};

        for (String type : types) {
            Customer c = CustomerFactory.createCustomer(type);
            assertNotNull("Factory failed to create " + type, c);
            String email = c.generateEmail();
            System.out.println("Testing " + type + ": " + email);
            assertFalse("Email content should not be empty", email.isEmpty());
        }
    }

    /**
     * Test 2: Verifies that the Factory produces the specific content
     * expected for a Business Customer.
     */
    @Test
    public void testBusinessCustomerContent() {
        Customer business = CustomerFactory.createCustomer("BUSINESS");
        String email = business.generateEmail();
        // Specific check for Business-related keywords
        assertTrue("Business email should mention invoices",
                email.contains("invoices") || email.contains("account summary"));
    }

    /**
     * Test 3: Verifies that the Factory is case-insensitive.
     * This ensures the application is robust against different user inputs.
     */
    @Test
    public void testFactoryCaseInsensitivity() {
        Customer lowerCaseVip = CustomerFactory.createCustomer("vip");
        Customer upperCaseVip = CustomerFactory.createCustomer("VIP");

        assertNotNull("Factory should handle lowercase input", lowerCaseVip);
        assertEquals("Both case types should produce the same class output",
                lowerCaseVip.getClass(), upperCaseVip.getClass());
    }

    /**
     * Test 4: Verifies that passing a null or empty string to the Factory
     * results in a proper exception rather than a NullPointerException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullTypeThrowsException() {
        CustomerFactory.createCustomer(null);
    }
}