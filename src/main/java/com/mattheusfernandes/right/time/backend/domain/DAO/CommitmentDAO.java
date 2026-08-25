package com.mattheusfernandes.right.time.backend.domain.DAO;

import com.mattheusfernandes.right.time.backend.domain.entity.Commitment;
import com.mattheusfernandes.right.time.backend.utils.query.CommitmentQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.UUID;

@ApplicationScoped
public class CommitmentDAO {

    @Inject
    private EntityManager entityManager;

    public UUID insertNewCommitment(Commitment commitment) {

        UUID id = UUID.randomUUID();

        entityManager
                .createNamedQuery(CommitmentQuery.INSERT_NEW_COMMITMENT)
                .setParameter("id", id)
                .setParameter("title", commitment.getTitle())
                .setParameter("commitment_date", commitment.getCommitmentDate())
                .setParameter("start_time", commitment.getStartTime())
                .setParameter("end_time", commitment.getEndTime())
                .setParameter("marking_color", commitment.getMarkingColor().ordinal())
                .executeUpdate();

        return id;
    }
}
