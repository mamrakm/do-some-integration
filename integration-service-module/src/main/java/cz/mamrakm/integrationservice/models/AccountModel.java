package cz.mamrakm.integrationservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class AccountModel extends IntegrationApiModel {
  private Long id;
  private String firstname;
  private String lastname;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updatedAt;
}
