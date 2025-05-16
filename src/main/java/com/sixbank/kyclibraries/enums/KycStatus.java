package com.sixbank.kyclibraries.enums;

/**
 * Represents the possible statuses of a KYC application
 */
public enum KycStatus {
    PENDING,           // Initial status when customer starts KYC process
    IN_PROGRESS,       // Customer has submitted some documents but not completed
    SUBMITTED,         // Customer has submitted all required documents
    UNDER_REVIEW,      // Admin is reviewing the KYC application
    REJECTED,          // KYC application has been rejected
    PARTIALLY_APPROVED, // Some documents approved, others rejected or pending
    APPROVED,          // KYC application has been fully approved
    EXPIRED            // KYC application has expired and needs renewal
}