package com.devo.booking.controller;

import com.devo.booking.service.BookingDto;
import com.devo.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

@Slf4j
@RestController
@RequestMapping("/bookings/{room_uuid}")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;


    @PatchMapping
    public BookingDto book(@PathVariable("room_uuid") @NonNull String roomUuid,
                           @RequestParam(name = "start") @NonNull @DateTimeFormat(iso = DATE) LocalDate start,
                           @RequestParam(name = "end") @NonNull @DateTimeFormat(iso = DATE) LocalDate end
    ) {
        log.info("Booking for the room: {} from {} to {}", roomUuid, start, end);
        return bookingService.bookRoom(roomUuid, start, end);
    }

}
