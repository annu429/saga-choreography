package com.anand.service;

import com.anand.entity.BookingEntity;
import com.anand.repository.BookingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookingServiceImpl {

    @Autowired
    private BookingRepo bookingRepo;

    public BookingEntity saveBooking(BookingEntity bookingEntity) {
        log.info("BookingServiceImpl saveBooking called", bookingEntity.toString());
        return bookingRepo.save(bookingEntity);
    }
}
