package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private String CategoryID;
    private String DepartmentID;
    private String CategoryName;
    private String Description;
    private String CategoryStatus;
}