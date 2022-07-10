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
@NoArgsConstructor // Hibernate needs it to do his job
@AllArgsConstructor
@Entity //for mapping class to database table (for creating connection with database)
// (by default @Entity uses class name as table name)
@Table(name = "RESERVATIONS") // for overriding default table name
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

    // property - how it works in Java
    // property: firstname
    // getter: getFirstName
    // setter: setFirstName
    // backing field: name
//    private String name;
//
//    public String getFirstname() {
//        return name;
//    }
//
//    public void setFirstname(String name) {
//        this.name = name;
//    }
}
