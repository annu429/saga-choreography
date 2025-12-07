package com.anand.controller;

import com.anand.entity.BookingEntity;
import com.anand.service.BookingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
@Slf4j
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingServiceImpl;

    @PostMapping("/movie")
    public ResponseEntity<BookingEntity> getBookings(@RequestBody BookingEntity bookingEntity) {
        log.info("BookingController getBookings called");
        bookingEntity = bookingServiceImpl.saveBooking(bookingEntity);
        return new ResponseEntity<BookingEntity>(bookingEntity, null, 200);
    }
}
