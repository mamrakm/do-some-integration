package cz.mamrakm.integrationservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import lombok.Data;

@Data
public class Account extends IntegrationApiModel {

  private Long id;

  private String firstname;

  private String lastname;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updatedAt;
}
