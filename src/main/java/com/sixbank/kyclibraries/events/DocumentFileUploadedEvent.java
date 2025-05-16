package com.sixbank.kyclibraries.events;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted when a customer uploads a document file.
 */
public class DocumentFileUploadedEvent {
    private UUID documentFileId;
    private UUID documentSubmissionId;
    private String fileName;
    private String fileKey;
    private String fileUrl;
    private Long fileSize;
    private LocalDateTime uploadDate;

    public DocumentFileUploadedEvent() {
    }

    public DocumentFileUploadedEvent(UUID documentFileId, UUID documentSubmissionId, String fileName, String fileKey, String fileUrl, Long fileSize, LocalDateTime uploadDate) {
        this.documentFileId = documentFileId;
        this.documentSubmissionId = documentSubmissionId;
        this.fileName = fileName;
        this.fileKey = fileKey;
        this.fileUrl = fileUrl;
        this.fileSize = fileSize;
        this.uploadDate = uploadDate;
    }

    public UUID getDocumentFileId() {
        return documentFileId;
    }

    public void setDocumentFileId(UUID documentFileId) {
        this.documentFileId = documentFileId;
    }

    public UUID getDocumentSubmissionId() {
        return documentSubmissionId;
    }

    public void setDocumentSubmissionId(UUID documentSubmissionId) {
        this.documentSubmissionId = documentSubmissionId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }
}

