package com.devo.booking.repository;

import lombok.val;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import static org.springframework.data.jpa.domain.Specification.where;

@Repository
public interface BookingRepository extends CrudRepository<BookingEntity, Integer>, JpaSpecificationExecutor<BookingEntity> {


    default boolean isBookingExist(RoomEntity room, LocalDate from, LocalDate to) {
        val bookingsInDateRange = findAll(
                where(room(room))
                        .and(dateBetween("startDate", from, to).or(dateBetween("endDate", from, to)))
        );

        return bookingsInDateRange.isEmpty();
    }

    default Specification<BookingEntity> room(RoomEntity room) {
        return (root, cq, cb) -> cb.equal(root.get("room"), room);
    }

    default Specification<BookingEntity> dateBetween(String fieldName, LocalDate dateFrom, LocalDate dateTo) {
        return (root, cq, cb) -> cb.between(root.get(fieldName), dateFrom, dateTo);
    }

}
