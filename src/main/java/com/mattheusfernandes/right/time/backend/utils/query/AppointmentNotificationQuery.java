package com.mattheusfernandes.right.time.backend.utils.query;

public class AppointmentNotificationQuery {

    public static final String INSERT_NEW_APPOINTMENT_NOTIFICATION = "AppointmentNotification.insertNewAppointmentNotification";

    public static final String INSERT_NEW_APPOINTMENT_NOTIFICATION_QUERY = """
            INSERT INTO appointments_notification(
                id,
                appointment_id,
                notification_status,
                sent_at,
                created_at,
                updated_at
            ) VALUES(
                :id,
                :appointment_id,
                :notification_status,
                :sent_at,
                :created_at,
                :updated_at
            )
            """;
}
