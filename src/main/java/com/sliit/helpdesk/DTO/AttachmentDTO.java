package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentDTO {
    private String AttachmentID;
    private String TicketID;
    private int UploadedByUserID;
    private String FileName;
    private String FileType;
    private String FilePath;
    private String UploadedAt;
}