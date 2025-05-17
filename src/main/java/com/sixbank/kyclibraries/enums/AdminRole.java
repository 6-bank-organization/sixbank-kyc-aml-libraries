package com.sixbank.kyclibraries.enums;

/**
 * Enum representing the different administrative roles available
 * within the KYC (Know Your Customer) system.
 */
public enum AdminRole {

    /**
     * KYC Administrator - has permissions to configure document types,
     * file types, and define rejection reasons.
     */
    KYC_ADMIN,

    /**
     * KYC Verifier - limited to verifying submitted KYC applications.
     */
    KYC_VERIFIER,

    /**
     * System Administrator - has full system privileges.
     */
    SYSTEM_ADMIN
}
