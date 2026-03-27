/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/26/2026
 * File Name: Main.java
 * Description: This is the main class that runs the application.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.CustomerFactory;
import edu.bu.met.cs665.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Main class.
 */
public class Main {
  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    // Segments we need to email
    String[] segments = {"Business", "Returning", "Frequent", "New", "VIP"};
    List<Customer> customersToEmail = new ArrayList<>();

    System.out.println("------------------------------------------------");
    System.out.println("             Email Generation System            ");
    System.out.println("------------------------------------------------");

    // Using Factory to create instances
    for (String type : segments) {
      try {
        Customer customer = CustomerFactory.createCustomer(type);
        customersToEmail.add(customer);
      } catch (IllegalArgumentException e) {
        System.err.println("Error creating customer: " + e.getMessage());
      }
    }

    // Generate the personalized emails
    for (Customer customer : customersToEmail) {
      System.out.println("\n[GENERATING EMAIL FOR: " + customer.getClass().getSimpleName() + "]");
      System.out.println(customer.generateEmail());
      System.out.println("------------------------------------------------");
    }
  }
}