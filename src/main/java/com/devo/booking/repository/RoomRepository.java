package com.devo.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Integer> {

    Optional<RoomEntity> findByUuid(String uuid);

}
