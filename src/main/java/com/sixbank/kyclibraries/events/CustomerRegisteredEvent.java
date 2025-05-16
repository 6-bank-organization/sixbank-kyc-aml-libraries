package com.sixbank.kyclibraries.events;

import java.util.UUID;

/**
 * Event emitted when a new customer registers on the platform.
 */
public class CustomerRegisteredEvent {
    private UUID customerId;
    private String customerNumber;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public CustomerRegisteredEvent() {
    }

    public CustomerRegisteredEvent(UUID customerId, String lastName, String firstName, String phoneNumber, String email, String customerNumber) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerNumber = customerNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }
}
