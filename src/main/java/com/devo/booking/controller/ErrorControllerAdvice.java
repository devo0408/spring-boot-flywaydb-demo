package com.devo.booking.controller;

import com.devo.booking.service.BookingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(BookingException.class)
    public ResponseEntity<String> handleBookingException() {
        return ResponseEntity.badRequest()
                .body("Room can`t be booked.");
    }

}
