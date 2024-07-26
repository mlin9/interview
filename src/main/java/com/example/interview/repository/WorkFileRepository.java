package com.example.interview.repository;

import com.example.interview.WorkFile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkFileRepository extends MongoRepository<WorkFile, String> {

}
