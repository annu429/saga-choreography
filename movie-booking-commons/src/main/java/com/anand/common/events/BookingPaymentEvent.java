package com.anand.common.events;

public record BookingPaymentEvent(String bookingId, boolean paymentCompleted, long amount) {
}
