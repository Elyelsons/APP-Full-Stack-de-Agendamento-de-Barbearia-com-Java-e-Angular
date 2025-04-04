package com.example.barbershop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "barber")
public class Barber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
}