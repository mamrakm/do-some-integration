package cz.mamrakm.integrationservice.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import cz.mamrakm.integrationservice.models.IntegrationApiModel;
import java.util.Date;

public class AccountDTO extends IntegrationApiModel {
  private Long id;
  private String firstname;
  private String lastname;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updatedAt;

  public AccountDTO() {}

  public AccountDTO(Long id, String firstname, String lastname, Date updatedAt) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.updatedAt = updatedAt;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
