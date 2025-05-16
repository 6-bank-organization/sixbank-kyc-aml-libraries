package com.sixbank.kyclibraries.events;

import java.util.UUID;

/**
 * Event emitted when an admin rejects a document file.
 */
public class DocumentFileRejectedEvent {
    private UUID documentFileId;
    private UUID rejectionReasonId;
    private String adminComments;
    private UUID adminId;

    public DocumentFileRejectedEvent() {
    }

    public DocumentFileRejectedEvent(UUID documentFileId, UUID rejectionReasonId, String adminComments, UUID adminId) {
        this.documentFileId = documentFileId;
        this.rejectionReasonId = rejectionReasonId;
        this.adminComments = adminComments;
        this.adminId = adminId;
    }

    public UUID getDocumentFileId() {
        return documentFileId;
    }

    public void setDocumentFileId(UUID documentFileId) {
        this.documentFileId = documentFileId;
    }

    public UUID getRejectionReasonId() {
        return rejectionReasonId;
    }

    public void setRejectionReasonId(UUID rejectionReasonId) {
        this.rejectionReasonId = rejectionReasonId;
    }

    public String getAdminComments() {
        return adminComments;
    }

    public void setAdminComments(String adminComments) {
        this.adminComments = adminComments;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }
}

