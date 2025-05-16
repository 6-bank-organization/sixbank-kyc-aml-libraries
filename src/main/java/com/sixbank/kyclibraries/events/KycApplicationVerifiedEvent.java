package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted when an admin verifies a KYC application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KycApplicationVerifiedEvent {
    private UUID kycApplicationId;
    private UUID adminId;
    private LocalDateTime verificationDate;
}

