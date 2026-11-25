package com.sliit.helpdesk.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO {
    private String NotificationID;
    private int UserID;
    private String TicketID;
    private String AppointmentID;
    private String Type;
    private String Message;
    private String IsRead;
    private String CreatedAt;
    private String ReadAt;
}