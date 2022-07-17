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

    private final ReservationService reservationService;

    public ReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations/{id}")
    public String showReservationById(@PathVariable("id") Long id, Model data) {
        var reservationFromDB = reservationService.findReservationById(id);
        data.addAttribute("reservation", reservationFromDB);

        return "reservation";
    }
}
