package com.sixbank.kyclibraries.enums;

/**
 * Enum representing the different stages of a document's submission
 * and review process within the KYC workflow.
 */
public enum SubmissionStatus {

    /**
     * Document is requested but has not yet been uploaded.
     */
    PENDING,

    /**
     * Document has been uploaded but is awaiting verification.
     */
    UPLOADED,

    /**
     * Document is currently under review by an admin.
     */
    UNDER_REVIEW,

    /**
     * Document has been reviewed and rejected.
     */
    REJECTED,

    /**
     * Document has been reviewed and approved.
     */
    APPROVED
}
