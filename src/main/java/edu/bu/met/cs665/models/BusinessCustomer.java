/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: BusinessCustomer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

/**
 * This is the BusinessCustomer class.
 * This class is responsible for implementing the Customer interface to generate emails for business customers.
 */
public class BusinessCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Dear Business Partner, your quarterly account summary and pending invoices are now ready.";
    }
}