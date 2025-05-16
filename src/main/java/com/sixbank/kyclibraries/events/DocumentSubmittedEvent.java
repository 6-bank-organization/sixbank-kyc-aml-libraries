package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Event emitted when a customer submits a document for verification as part of their KYC.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentSubmittedEvent {
    private UUID documentSubmissionId;
    private UUID kycApplicationId;
    private UUID documentTypeId;
}

