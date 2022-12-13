package com.bej.authenticationservice.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  private int userId;
  private String firstName;
  private String lastName;
  private String username;

  private String password;
  private String address;

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", address='" + address + '\'' +
            '}';
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

    public User(int userId, String firstName, String lastName, String username, String password, String address) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public User() {
    }

  public void setPassword(String password) {
      this.password = password;
  }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
