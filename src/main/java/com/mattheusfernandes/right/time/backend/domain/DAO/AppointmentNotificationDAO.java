package com.mattheusfernandes.right.time.backend.domain.DAO;

import com.mattheusfernandes.right.time.backend.domain.entity.AppointmentNotification;
import com.mattheusfernandes.right.time.backend.utils.query.AppointmentNotificationQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.UUID;

@ApplicationScoped
public class AppointmentNotificationDAO {

    @Inject
    private EntityManager entityManager;

    public UUID insertNewAppointmentNotification(AppointmentNotification appointmentNotification) {

        UUID id = UUID.randomUUID();

        entityManager
                .createNamedQuery(AppointmentNotificationQuery.INSERT_NEW_APPOINTMENT_NOTIFICATION)
                .setParameter("id", id)
                .setParameter("appointment_id", appointmentNotification.getAppointment().getId())
                .setParameter("notification_status", appointmentNotification.getNotificationStatus().ordinal())
                .setParameter("sent_at", appointmentNotification.getSentAt())
                .setParameter("created_at", appointmentNotification.getCreatedAt())
                .setParameter("updated_at", appointmentNotification.getUpdatedAt())
                .executeUpdate();

        return id;
    }
}
