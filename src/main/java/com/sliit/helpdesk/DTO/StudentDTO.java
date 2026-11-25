package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class StudentDTO extends UserDTO {
    private String StudentNumber;
    private String Faculty;
    private String Programme;
    private int AcademicYear;
}