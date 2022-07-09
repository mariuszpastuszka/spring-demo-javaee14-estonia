package com.sda.springdemojavaee14.service;

import com.sda.springdemojavaee14.entity.Reservation;
import com.sda.springdemojavaee14.repository.ReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations() {
        log.info("finding all reservations");

        return reservationRepository.findAllReservationInRepository();
    }
}
