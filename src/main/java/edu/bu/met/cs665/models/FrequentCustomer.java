/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: FrequentCustomer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

/**
 * This is the FrequentCustomer class.
 * This class is responsible for implementing the Customer interface to generate emails for frequent customers.
 */
public class FrequentCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Hello Frequent Shopper! You have earned enough points for a free gift with your next purchase.";
    }
}