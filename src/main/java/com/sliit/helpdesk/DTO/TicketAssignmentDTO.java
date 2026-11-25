package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketAssignmentDTO {
    private String AssignmentID;
    private String TicketID;
    private Integer SupportStaffUserID;
    private Integer DepartmentOfficerUserID;
    private int AssignedByUserID;
    private String AssignedAt;
    private String UnassignedAt;
    private String AssignmentStatus;
}