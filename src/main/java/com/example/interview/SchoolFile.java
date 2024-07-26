package com.example.interview;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class SchoolFile {

  public SchoolFile () {}

  public SchoolFile (Date createdAt, String schoolName, String author) {
    this.createdAt = createdAt;
    this.schoolName = schoolName;
    this.author = author;
  }

  @Id
  public String fileId;
  public Date createdAt;
  public String schoolName;
  public String author;

  @Override
  public String toString() {
    return String.format(
            "SchoolFile[fileId=%s, createdAt='%s', schoolName='%s', author='%s']",
            fileId, createdAt.toString(), schoolName, author);
  }
}
