/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: Customer.java
 * Description: This class is responsible for instantiating concrete Customer objects.
 */

package edu.bu.met.cs665.models;

public interface Customer {
    /**
     * Generates a personalized email message for the specific customer segment.
     * @return String containing the email body.
     */
    String generateEmail();
}