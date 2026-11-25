package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscalationRuleDTO {
    private String RuleID;
    private String DepartmentID;
    private String CategoryID;
    private int ThresholdHours;
    private String EscalateToRole;
    private String IsActive;
    private int CreatedByUserID;
    private String CreatedAt;
}