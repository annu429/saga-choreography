package com.anand.seat_service.entity;


import com.anand.seat_service.utils.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "SEAT_INVENTORY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SeatInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "theater_id")
    private String theaterId;

    @Column(name = "show_id")
    private String showId;

    @Column(name = "seat_number")
    private String seatNumber;

    @Column(name = "screen_id")
    private String screenId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private SeatStatus status; // AVAILABLE, LOCKED, RESERVED

    @Column(name = "current_booking_id")
    private String currentBookingId; // if seat is locked/reserved for booking

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;


    @PrePersist
    @PreUpdate
    public void onUpdate() {
        lastUpdated = LocalDateTime.now();
    }
}