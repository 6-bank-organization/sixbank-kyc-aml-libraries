package com.sixbank.kyclibraries.enums;

/**
 * Represents the possible statuses of document submissions
 */
public enum SubmissionStatus {
    PENDING,           // Document has been requested but not uploaded
    UPLOADED,          // Document has been uploaded but not verified
    UNDER_REVIEW,      // Document is being reviewed by admin
    REJECTED,          // Document has been rejected
    APPROVED           // Document has been approved
}
