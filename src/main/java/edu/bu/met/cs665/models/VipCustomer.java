/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: VipCustomer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

/**
 * This is the VipCustomer class.
 * This class is responsible for implementing the Customer interface to generate emails for vip customers.
 */
public class VipCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Dear VIP, as a token of our appreciation, you have been granted early access to our semi-annual suiting sale.";
    }
}