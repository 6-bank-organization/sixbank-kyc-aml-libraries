package com.sixbank.kyclibraries.enums;

/**
 * Enum representing the possible statuses of a KYC application
 * throughout its lifecycle.
 */
public enum KycStatus {

    /**
     * Initial status when a customer begins the KYC process.
     */
    PENDING,

    /**
     * Customer has submitted some documents, but the process is not complete.
     */
    IN_PROGRESS,

    /**
     * All required documents have been submitted by the customer.
     */
    SUBMITTED,

    /**
     * KYC application is currently under administrative review.
     */
    UNDER_REVIEW,

    /**
     * KYC application has been rejected.
     */
    REJECTED,

    /**
     * Some submitted documents are approved; others are rejected or pending.
     */
    PARTIALLY_APPROVED,

    /**
     * KYC application has been fully reviewed and approved.
     */
    APPROVED,

    /**
     * KYC application is no longer valid and requires renewal.
     */
    EXPIRED
}
