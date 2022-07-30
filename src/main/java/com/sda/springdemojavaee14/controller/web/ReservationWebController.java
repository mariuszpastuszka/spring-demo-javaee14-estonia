package com.sda.springdemojavaee14.controller.web;

import com.sda.springdemojavaee14.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/web")
public class ReservationWebController {

    private static final String ONE_RESERVATION_KEY = "reservation";
    private static final String RESERVATIONS_KEY = "reservations";
    private final ReservationService reservationService;

    public ReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations/{id}")
    public String showReservationById(@PathVariable("id") Long id, Model data) {
        var reservationFromDB = reservationService.findReservationById(id);
        data.addAttribute(ONE_RESERVATION_KEY, reservationFromDB);

        return "reservations/reservation-details";
    }

    @GetMapping("/reservations")
    public String showAllReservations(Model data) {

        var reservationsFromDB = reservationService.findAllReservations();
        data.addAttribute(RESERVATIONS_KEY, reservationsFromDB);

        return "reservations/all-reservations";
    }
}
