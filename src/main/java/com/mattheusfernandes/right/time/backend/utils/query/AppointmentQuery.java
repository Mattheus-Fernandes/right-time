package com.mattheusfernandes.right.time.backend.utils.query;

public class AppointmentQuery {

    private static final String INSERT_NEW_APPOINTMENT = "Appointment.insertNewAppointment";

    private static final String INSERT_NEW_APPOINTMENT_QUERY = """
            INSERT INTO appointments(
                customer_id,
                appointment_date,
                start_time,
                end_time,
                service,
                observation,
                appointment_color,
                appointment_status
            )
            VALUES(
                :customer_id,
                :appointment_date,
                :start_time,
                :end_time,
                :service,
                :observation,
                :appointment_color,
                :appointment_status
            )
            """;
}
