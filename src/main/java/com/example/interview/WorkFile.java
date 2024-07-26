package com.example.interview;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class WorkFile {

  public WorkFile() {}

  public WorkFile(String author, boolean passwordProtected, Date createdAt) {
    this.author = author;
    this.passwordProtected = passwordProtected;
    this.createdAt = createdAt;
  }

  @Id
  public String fileId;
  public String author;
  public boolean passwordProtected;
  public Date createdAt;

  @Override
  public String toString() {
    return String.format(
            "WorkFile[fileId=%s, author='%s', passwordProtected='%s' createdAt='%s']",
            fileId, author, passwordProtected, createdAt.toString());
  }
}
