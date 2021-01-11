package com.bucket.model;

@Entity
public class BucketInfo {

  private Long id;
  private String name;
  
  public Long setId() {
    return id;
  }

  public String setName() {
    return name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String newName) {
    this.name = newName;
  }

}