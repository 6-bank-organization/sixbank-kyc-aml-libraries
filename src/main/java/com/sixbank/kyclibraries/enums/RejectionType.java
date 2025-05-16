package com.sixbank.kyclibraries.enums;

/**
 * Represents the types of rejection reasons
 */
public enum RejectionType {
    DOCUMENT_QUALITY,  // Issues with document image quality
    DOCUMENT_VALIDITY, // Issues with document validity (expired, tampered)
    LIVENESS_CHECK,    // Issues with liveness check
    INFORMATION_MISMATCH, // Information doesn't match across documents
    OTHER              // Other reasons
}
