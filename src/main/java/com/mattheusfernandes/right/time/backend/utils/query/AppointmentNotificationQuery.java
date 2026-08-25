package com.mattheusfernandes.right.time.backend.utils.query;

public class AppointmentNotificationQuery {

    private static final String INSERT_NEW_APPOINTMENT_NOTIFICATION = "";

    private static final String INSERT_NEW_APPOINTMENT_NOTIFICATION_QUERY = """
            INSERT INTO appointments_notification(
                appointment_id,
                notification_status,
                sent_at,
                created_at,
                updated_at
            ) VALUES(
                :appointment_id,
                :notification_status,
                :sent_at,
                :created_at,
                :updated_at
            )
            """;
}
