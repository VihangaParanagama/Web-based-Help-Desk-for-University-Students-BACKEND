package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private String DepartmentID;
    private String DepartmentName;
    private String Description;
    private String ContactEmail;
    private String DepartmentStatus;
}