package com.example.barbershop.dto;

import java.time.LocalDateTime;

public class AppointmentDTO {
    private Long barberId;
    private String customerName;
    private LocalDateTime appointmentDate;

    // Getters e Setters
    public Long getBarberId() {
        return barberId;
    }

    public void setBarberId(Long barberId) {
        this.barberId = barberId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}