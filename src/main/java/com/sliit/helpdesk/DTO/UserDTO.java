package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    protected int  userID;
    protected String FullName;
    protected String Email;
    protected String PasswordHash;
    protected String AccountStatus;
    protected String MustChangePassword;
    protected String EmailVerified;
    protected String CreatedByUserID;
    protected String CreatedAt;
    protected String LastLoginAt;
    protected String NameWithInitials;
    protected String Gender;
}
