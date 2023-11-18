package com.ywxx.cineEase.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "number_of_seats")
    private Integer numberOfSeats;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "status")
    private Integer status;

    @Column(name = "user_id",insertable=false, updatable=false)
    private Integer userId;

    @Column(name = "show_id",insertable=false, updatable=false)
    private Integer showId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "show_id", referencedColumnName = "show_id")
    private Show show;
}
