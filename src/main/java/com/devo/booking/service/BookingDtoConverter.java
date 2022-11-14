package com.devo.booking.service;

import com.devo.booking.repository.BookingEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookingDtoConverter implements Converter<BookingEntity, BookingDto> {

    @Override
    public BookingDto convert(BookingEntity source) {
        return BookingDto.builder()
                .uuid(source.getUuid())
                .startDate(source.getStartDate())
                .endDate(source.getEndDate())
                .build();
    }

}
