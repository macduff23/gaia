package io.codeka.gaia.stacks.repository;

import io.codeka.gaia.stacks.bo.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for jobs
 */
@Repository
public interface JobRepository extends MongoRepository<Job, String>{

    List<Job> findAllByStackId(String stackId);

}
