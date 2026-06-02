package com.lavanderia.java.dtos.loan;

import java.time.LocalDateTime;

import com.lavanderia.java.enums.LoanStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {
        private Long id;

    private String guestName;

    private String roomNumber;

    private LocalDateTime loanDate;

    private LocalDateTime expectedReturnDate;

    private LoanStatus status;

    private String qrCode;

    private String notes;
}
