package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Event emitted when a customer submits a liveness check (e.g., video selfie).
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivenessCheckSubmittedEvent {
    private UUID livenessCheckId;
    private UUID kycApplicationId;
    private String videoUrl;
}

