package com.lavanderia.java.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanderia.java.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    Optional<Guest> findByEmail(String email);
    Optional<Guest> findByRoomNumber(String roomNumber);
}
