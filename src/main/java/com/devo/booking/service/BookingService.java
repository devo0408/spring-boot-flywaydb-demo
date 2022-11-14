package com.devo.booking.service;

import com.devo.booking.repository.BookingEntity;
import com.devo.booking.repository.BookingRepository;
import com.devo.booking.repository.RoomEntity;
import com.devo.booking.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final RoomRepository roomRepository;

    private final BookingRepository bookingRepository;

    private final BookingDtoConverter bookingDtoConverter;


    public BookingDto bookRoom(String roomUuid, LocalDate startDate, LocalDate endDate) {
        return roomRepository.findByUuid(roomUuid)
                .filter(roomEntity -> !bookingRepository.isBookingExist(roomEntity, startDate, endDate))
                .map(roomEntity -> buildBookingEntity(roomEntity, startDate, endDate))
                .map(bookingRepository::save)
                .map(bookingDtoConverter::convert)
                .orElseThrow(BookingException::new);
    }

    public boolean isRoomAvailable(String roomUuid, LocalDate startDate, LocalDate endDate) {
        return roomRepository.findByUuid(roomUuid)
                .map(roomEntity -> bookingRepository.isBookingExist(roomEntity, startDate, endDate))
                .orElse(false);
    }

    private BookingEntity buildBookingEntity(RoomEntity roomEntity, LocalDate start, LocalDate end) {
        return BookingEntity.builder()
                .uuid(IdentifierGenerator.getNextUuid())
                .room(roomEntity)
                .startDate(start)
                .endDate(end)
                .build();
    }

}

