package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted when a customer submits a KYC application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KycApplicationSubmittedEvent {
    private UUID kycApplicationId;
    private UUID customerId;
    private LocalDateTime submissionDate;
}

