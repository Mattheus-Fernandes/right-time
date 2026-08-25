package com.mattheusfernandes.right.time.backend.utils.query;

public class CommitmentQuery {

    private static final String INSERT_NEW_COMMITMENT = "Commitment.insertNewCommitment";

    private static final String INSERT_NEW_COMMITMENT_QUERY = """
            INSERT INTO commitments (
                title,
                commitment_date,
                start_time,
                end_time,
                marking_color
            )
            VALUES(
                :title,
                :commitment_date,
                :start_time,
                :end_time,
                :marking_color
            )
            """;

}
