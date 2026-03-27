/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2026
 * File Name: CustomerFactory.java
 * Description: This class is responsible for creating Customer objects based on their type.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.models.*;

/**
 * This is the CustomerFactory class.
 * This class is responsible for creating Customer objects based on their type.
 */
public class CustomerFactory {

    public static Customer createCustomer(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Customer type cannot be null or empty.");
        }

        switch (type.toUpperCase()) {
            case "BUSINESS":
                return new BusinessCustomer();
            case "RETURNING":
                return new ReturningCustomer();
            case "FREQUENT":
                return new FrequentCustomer();
            case "NEW":
                return new NewCustomer();
            case "VIP":
                return new VipCustomer();
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}