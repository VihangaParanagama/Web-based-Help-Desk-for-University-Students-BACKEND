package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    private String AppointmentID;
    private String TicketID;
    private int StudentUserID;
    private int OfficerUserID;
    private String RequestedAt;
    private String ScheduledAt;
    private String Status;
    private String Reason;
    private String OutcomeNotes;
    private String AgreedActions;
    private String OutcomeRecordedAt;
}