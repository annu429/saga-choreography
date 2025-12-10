package com.anand.common.events;

public record SeatReservedEvent(String bookingId, boolean reserved, long amount) {}
