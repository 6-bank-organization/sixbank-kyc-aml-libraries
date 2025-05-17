package com.sixbank.kyclibraries.enums;

/**
 * Enum defining the various types of rejection reasons
 * that may be applied to a document or application during KYC.
 */
public enum RejectionType {

    /**
     * Rejection due to poor document image quality (e.g., blurry or unclear).
     */
    DOCUMENT_QUALITY,

    /**
     * Rejection due to document validity issues (e.g., expired, tampered).
     */
    DOCUMENT_VALIDITY,

    /**
     * Rejection due to failure in the liveness check process.
     */
    LIVENESS_CHECK,

    /**
     * Rejection due to mismatched information across submitted documents.
     */
    INFORMATION_MISMATCH,

    /**
     * Other miscellaneous reasons not categorized above.
     */
    OTHER
}
