package io.codeka.gaia.stacks.repository;

import io.codeka.gaia.stacks.bo.Stack;
import io.codeka.gaia.stacks.bo.StackState;
import io.codeka.gaia.teams.Team;
import io.codeka.gaia.teams.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for stacks
 */
@Repository
public interface StackRepository extends MongoRepository<Stack, String>{

    int countStacksByStateAndOwnerTeam(StackState state, Team team);

    int countStacksByStateAndCreatedBy(StackState state, User user);

    int countStacksByState(StackState state);

    List<Stack> findByOwnerTeam(Team team);

    Optional<Stack> findByIdAndOwnerTeam(String id, Team team);
}
