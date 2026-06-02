package com.lavanderia.java.dtos.loan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoanItemRequest {
    private Long inventoryItemId;
    private Integer quantity;
}
