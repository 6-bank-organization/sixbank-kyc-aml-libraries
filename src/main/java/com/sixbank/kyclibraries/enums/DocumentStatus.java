package com.sixbank.kyclibraries.enums;

/**
 * Enum representing the status of a KYC document during the verification lifecycle.
 *
 * <p>This status is used within the {@link 'UploadedDocument'} entity to track
 * the state of a document submitted by the user for KYC verification.</p>
 *
 * <ul>
 *   <li>{@link #PENDING} - The document has been uploaded and is awaiting review.</li>
 *   <li>{@link #VERIFIED} - The document has been reviewed and successfully verified.</li>
 *   <li>{@link #REJECTED} - The document has been reviewed and rejected (reason required).</li>
 *   <li>{@link #EXPIRED} - The document was once verified but has now expired and needs re-upload.</li>
 *   <li>{@link #RESUBMITTED} - A rejected document has been re-uploaded and is pending review again.</li>
 *   <li>{@link #DELETED} - The document has been deleted by the user or administrator.</li>
 * </ul>
 *
 * <p>This enum helps drive the KYC approval workflow and determine customer compliance.</p>
 */
public enum DocumentStatus {

    /**
     * Document is newly uploaded and awaiting verification.
     */
    PENDING,

    /**
     * Document has been verified and approved.
     */
    VERIFIED,

    /**
     * Document was reviewed and rejected (must have a rejection reason).
     */
    REJECTED,

    /**
     * Document has passed its validity period and is no longer acceptable.
     */
    EXPIRED,

    /**
     * Previously rejected document has been re-uploaded for another review cycle.
     */
    RESUBMITTED,

    /**
     * Document was removed from the system.
     */
    DELETED;
}

