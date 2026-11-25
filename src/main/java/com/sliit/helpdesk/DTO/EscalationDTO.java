package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscalationDTO {
    private String EscalationID;
    private String TicketID;
    private String RuleID;
    private Integer EscalatedByUserID;
    private Integer DepartmentOfficerUserID;
    private Integer AdministratorUserID;
    private String Reason;
    private String EscalatedAt;
    private String EscalationStatus;
}