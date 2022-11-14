package com.devo.booking.repository;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "rooms")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "uuid", nullable = false, unique = true)
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

}
