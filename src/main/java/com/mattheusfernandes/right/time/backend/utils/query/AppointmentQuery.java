package com.mattheusfernandes.right.time.backend.utils.query;

public class AppointmentQuery {

    public static final String INSERT_NEW_APPOINTMENT = "Appointment.insertNewAppointment";

    public static final String INSERT_NEW_APPOINTMENT_QUERY = """
            INSERT INTO appointments(
                id,
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
                :id,
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
