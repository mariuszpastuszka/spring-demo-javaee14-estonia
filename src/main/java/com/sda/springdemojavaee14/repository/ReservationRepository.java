package com.sda.springdemojavaee14.repository;

import com.sda.springdemojavaee14.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends
        // first argument is Entity
        // second is type of primary key of Entity
        JpaRepository<Reservation, Long> {

    List<Reservation> findBySurname(String surname);

    List<Reservation> findBySurnameAndEmailAndPhoneNumber(String surname, String email, String phoneNumber);

    @Query("""
            select r from Reservation r
            where (r.address = :address and r.numberOfPeople = :givenNumber) or (r.tableNumber = :givenTableNumber)
        """)
    List<Reservation> findComplicatedQuery(@Param("address") String address, @Param("givenNumber") int givenNumber,
                                           @Param("givenTableNumber") Long tableNumber);
}
