package com.sda.springdemojavaee14.controller.rest;

import com.sda.springdemojavaee14.entity.Reservation;
import com.sda.springdemojavaee14.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ReservationRestController {

    private final ReservationService reservationService;

    public ReservationRestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        log.info("getting all reservations");

        return reservationService.findAllReservations();
    }
}
