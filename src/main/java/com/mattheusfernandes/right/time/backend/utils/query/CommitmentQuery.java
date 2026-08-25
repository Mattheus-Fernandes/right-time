package com.mattheusfernandes.right.time.backend.utils.query;

public class CommitmentQuery {

    public static final String INSERT_NEW_COMMITMENT = "Commitment.insertNewCommitment";

    public static final String INSERT_NEW_COMMITMENT_QUERY = """
            INSERT INTO commitments (
                id,
                title,
                commitment_date,
                start_time,
                end_time,
                marking_color
            )
            VALUES(
                :id,
                :title,
                :commitment_date,
                :start_time,
                :end_time,
                :marking_color
            )
            """;

}
