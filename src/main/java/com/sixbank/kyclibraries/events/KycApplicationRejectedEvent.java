package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Event emitted when an admin rejects a KYC application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KycApplicationRejectedEvent {
    private UUID kycApplicationId;
    private UUID adminId;
    private UUID rejectionReasonId;
    private String adminComments;
}

