package com.example.interview;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class HelperService {

  private final MongoTemplate mongoTemplate;

  @Autowired
  public HelperService(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  public void print1(List<String> fileIds, String collectionName) {
    for (int i = 0; i < fileIds.size(); i++) {
      System.out.println("File ID is" + fileIds.get(i));
      SchoolFile file = mongoTemplate.findOne(Query.query(Criteria.where("fileId").is(fileIds.get(i))), SchoolFile.class, collectionName);

      if (file != null && file.author != null && !file.author.equals("")) {
        System.out.println(file.author);
      }
    }
  }

  public void print2(List<String> fileIds, String collectionName) {
    for (int i = 0; i < fileIds.size(); i++) {
      System.out.println("File ID is" + fileIds.get(i));
      WorkFile file = mongoTemplate.findOne(Query.query(Criteria.where("fileId").is(fileIds.get(i))), WorkFile.class, collectionName);

      if (file != null && file.author != null && !file.author.equals("")) {
        System.out.println(file.author);
      }
    }
  }
}
