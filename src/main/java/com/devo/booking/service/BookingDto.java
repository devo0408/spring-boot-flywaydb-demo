package com.devo.booking.service;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BookingDto {

    String uuid;

    LocalDate startDate;

    LocalDate endDate;
}
