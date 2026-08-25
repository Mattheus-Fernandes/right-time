package com.mattheusfernandes.right.time.backend.domain.DAO;

import com.mattheusfernandes.right.time.backend.domain.entity.Appointment;
import com.mattheusfernandes.right.time.backend.utils.query.AppointmentQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.UUID;

@ApplicationScoped
public class AppointmentDAO {

    @Inject
    private EntityManager entityManager;

    public UUID insertAppoint(Appointment appointment) {

        UUID id = UUID.randomUUID();

        entityManager
                .createNamedQuery(AppointmentQuery.INSERT_NEW_APPOINTMENT)
                .setParameter("id", id)
                .setParameter("customer_id", appointment.getCustomer().getId())
                .setParameter("appointment_date", appointment.getAppointmentDate())
                .setParameter("start_time", appointment.getStartTime())
                .setParameter("end_time", appointment.getEndTime())
                .setParameter("service", appointment.getService().ordinal())
                .setParameter("observation", appointment.getObservation())
                .setParameter("appointment_color", appointment.getAppointmentColor().ordinal())
                .setParameter("appointment_status", appointment.getAppointmentStatus().ordinal())
                .executeUpdate();

        return id;
    }
}
