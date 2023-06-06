package cz.mamrakm.businessservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import lombok.Data;

@Data
public class BillingAccountDTO {

  private Long id;

  private String name; /* firstname + lastname */

  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date lastUpdate;
}
