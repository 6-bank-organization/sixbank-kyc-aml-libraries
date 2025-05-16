package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted when an admin verifies the liveness check.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivenessCheckVerifiedEvent {
    private UUID livenessCheckId;
    private UUID adminId;
    private LocalDateTime verificationDate;
}

