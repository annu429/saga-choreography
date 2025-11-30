package com.anand.controller;

import com.anand.entity.BookingEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @PostMapping("/movie")
    public ResponseEntity<BookingEntity> getBookings(@RequestBody BookingEntity bookingEntity) {
        return new ResponseEntity<BookingEntity>(bookingEntity, null, 200);
    }
}
