package com.lavanderia.java.dtos.guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateGuestRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String roomNumber;
    private Integer keyNumber;
    
}
