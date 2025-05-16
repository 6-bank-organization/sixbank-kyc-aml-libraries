package com.sixbank.kyclibraries.events;

import com.sixbank.kyclibraries.enums.KycStatus;

import java.util.UUID;

/**
 * Event emitted when the KYC status of a customer changes (e.g., verified or rejected).
 */
public class CustomerKycStatusChangedEvent {
    private UUID customerId;
    private UUID kycApplicationId;
    private KycStatus newStatus;
    private String comment;

    public CustomerKycStatusChangedEvent() {
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public UUID getKycApplicationId() {
        return kycApplicationId;
    }

    public void setKycApplicationId(UUID kycApplicationId) {
        this.kycApplicationId = kycApplicationId;
    }

    public KycStatus getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(KycStatus newStatus) {
        this.newStatus = newStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

