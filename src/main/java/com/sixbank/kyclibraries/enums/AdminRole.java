package com.sixbank.kyclibraries.enums;

/**
 * Represents admin roles within the KYC system
 */
public enum AdminRole {
    KYC_ADMIN,         // Can configure document types, file types, and rejection reasons
    KYC_VERIFIER,      // Can only verify KYC applications
    SYSTEM_ADMIN       // Has all privileges
}
