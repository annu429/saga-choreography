package com.anand.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    private Long id;
    private Long amount;
    private String bookingCode;
    private Instant createdAt;
    private String showId;
    private String status; // PENDING, CONFIRMED, CANCELLED
    private String userId;
    @ElementCollection
    private List<String> seatIds;
}
