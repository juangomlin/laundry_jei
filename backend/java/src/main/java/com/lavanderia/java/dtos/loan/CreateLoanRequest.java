package com.lavanderia.java.dtos.loan;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLoanRequest {
    private Long guestId;
    private String notes;
    private List<LoanItemRequest> items;
}
