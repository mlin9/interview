package com.example.interview.repository;

import com.example.interview.SchoolFile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolFileRepository extends MongoRepository<SchoolFile, String> {

}
