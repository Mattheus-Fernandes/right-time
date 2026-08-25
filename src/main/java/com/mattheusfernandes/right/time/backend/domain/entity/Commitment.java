package com.mattheusfernandes.right.time.backend.domain.entity;

import com.mattheusfernandes.right.time.backend.domain.enums.MarkingColor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Table(name = "commitments")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Commitment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "commitment_date", nullable = false)
    private LocalDate commitmentDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Column(name = "marking_color", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private MarkingColor markingColor;
}
