package com.sda.springdemojavaee14.service;

import com.sda.springdemojavaee14.entity.Reservation;
import com.sda.springdemojavaee14.repository.ReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations() {
        log.info("finding all reservations");

        return reservationRepository.findAll();
    }

    public Reservation findReservationById(Long reservationId) {
        log.info("finding reservation with id: [{}]", reservationId);
//        Optional<Reservation> reservationFromDb = reservationRepository.findById(reservationId);
        // var is just for less typing and replaces all type name - the same as above line
        // if You use var provide good name - always try to provide good name
        var reservationFromDb = reservationRepository.findById(reservationId);
        return reservationFromDb.orElse(null);
    }

    public void deleteReservationById(Long reservationId) {
        log.info("delete reservation with id: [{}]", reservationId);
        reservationRepository.deleteById(reservationId);
    }
}
