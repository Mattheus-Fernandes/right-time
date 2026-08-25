package com.mattheusfernandes.right.time.backend.domain.entity;

import com.mattheusfernandes.right.time.backend.domain.enums.NotificationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "appointments_notification")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppointmentNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @Column(name = "notification_status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private NotificationStatus notificationStatus;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
