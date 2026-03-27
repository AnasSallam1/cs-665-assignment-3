/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: NewCustomer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

/**
 * This is the NewCustomer class.
 * This class is responsible for implementing the Customer interface to generate emails for new customers.
 */
public class NewCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Welcome to our community! We're excited to help you get started with our services.";
    }
}