package com.devo.booking.service;

import lombok.experimental.UtilityClass;

import static java.util.UUID.randomUUID;

@UtilityClass
public class IdentifierGenerator {

    public static String getNextUuid() {
        return randomUUID().toString();
    }
}
