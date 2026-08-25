package com.mattheusfernandes.right.time.backend.domain.entity;

import com.mattheusfernandes.right.time.backend.domain.enums.AppointmentService;
import com.mattheusfernandes.right.time.backend.domain.enums.AppointmentStatus;
import com.mattheusfernandes.right.time.backend.domain.enums.MarkingColor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Table(name = "appointments")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Appointment {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Column(name = "service", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private AppointmentService service;

    @Column(name = "observation")
    private String observation;

    @Column(name = "appointment_color", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private MarkingColor appointmentColor;

    @Column(name = "appointment_status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private AppointmentStatus appointmentStatus;
}
