package com.sixbank.kyclibraries.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted when an admin verifies a document file.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentFileVerifiedEvent {
    private UUID documentFileId;
    private UUID adminId;
    private LocalDateTime verificationDate;
}

