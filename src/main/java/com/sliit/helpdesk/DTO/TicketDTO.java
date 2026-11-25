package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private String TicketID;
    private int StudentUserID;
    private String CategoryID;
    private String Subject;
    private String Description;
    private String Priority;
    private String Status;
    private String CreatedAt;
    private String UpdatedAt;
    private String ResolvedAt;
    private String ClosedAt;
}