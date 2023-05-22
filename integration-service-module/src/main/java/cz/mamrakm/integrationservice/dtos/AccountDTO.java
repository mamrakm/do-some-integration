package cz.mamrakm.integrationservice.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import cz.mamrakm.integrationservice.models.IntegrationApiModel;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@ToString
public class AccountDTO extends IntegrationApiModel {
  private Long id;

  private String firstname;

  private String lastname;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updatedAt;
}
