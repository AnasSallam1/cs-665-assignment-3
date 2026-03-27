/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: ReturningCustomer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

/**
 * This is the ReturningCustomer class.
 * This class is responsible for implementing the Customer interface to generate emails for returning customers.
 */
public class ReturningCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Welcome back! We've missed you. Here is a 15% discount code for your next purchase.";
    }
}