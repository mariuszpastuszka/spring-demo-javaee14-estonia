package com.sda.springdemojavaee14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESERVATIONS")
public class Reservation {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long tableNumber;

    LocalDateTime startBookingTime;

    LocalDateTime endBookingTime;

    String surname;

    String phoneNumber;

    String email;

    int numberOfPeople;

    String address;
}
