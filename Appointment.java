package com.example.barbershop.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "barber_id", nullable = false)
    private Barber barber;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private LocalDateTime appointmentDate;
}