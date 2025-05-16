package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Event emitted when an admin rejects a liveness check submission.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivenessCheckRejectedEvent {
    private UUID livenessCheckId;
    private UUID rejectionReasonId;
    private String adminComments;
    private UUID adminId;
}

