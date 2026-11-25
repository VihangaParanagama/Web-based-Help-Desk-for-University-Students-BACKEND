package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketHistoryDTO {
    private String HistoryID;
    private String TicketID;
    private int ChangedByUserID;
    private String ActionType;
    private String OldStatus;
    private String NewStatus;
    private String OldPriority;
    private String NewPriority;
    private String Remarks;
    private String ChangedAt;
}