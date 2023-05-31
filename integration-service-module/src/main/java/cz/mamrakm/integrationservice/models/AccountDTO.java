package cz.mamrakm.integrationservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Data
@ToString
public class AccountDTO extends IntegrationApiDTO {
  private Long id;
  private String firstname;
  private String lastname;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updatedAt;
}
