package com.example.barbershop.service;

import com.example.barbershop.dto.AppointmentDTO;
import com.example.barbershop.entity.Appointment;
import com.example.barbershop.repository.AppointmentRepository;
import com.example.barbershop.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private BarberRepository barberRepository;

    public Appointment createAppointment(AppointmentDTO dto) {
        Barber barber = barberRepository.findById(dto.getBarberId())
                .orElseThrow(() -> new RuntimeException("Barber not found"));

        Appointment appointment = new Appointment();
        appointment.setBarber(barber);
        appointment.setCustomerName(dto.getCustomerName());
        appointment.setAppointmentDate(dto.getAppointmentDate());

        return appointmentRepository.save(appointment);
    }
}