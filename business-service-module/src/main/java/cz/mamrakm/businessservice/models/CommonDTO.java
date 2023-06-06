package cz.mamrakm.businessservice.models;

import java.io.Serializable;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
public class CommonDTO implements Serializable {

  private String operation;

  private IntegrationApiDTO apiModel;

  public void setApiModel(AccountDTO apiModel) {
    this.apiModel = apiModel;
  }
}
