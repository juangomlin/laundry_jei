package com.lavanderia.java.entity;

import java.time.LocalDateTime;

import com.lavanderia.java.enums.LoanStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime loanDate;

    @Column(nullable = false)
    private LocalDateTime expectedReturnDate;

    @Column(nullable = true)
    private LocalDateTime actualReturnDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    @Column(nullable = false)
    private String qrCode;

    @Column(length = 255)
    private String notes;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    private Guest guest;
}
