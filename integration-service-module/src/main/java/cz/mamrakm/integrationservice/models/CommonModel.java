package cz.mamrakm.integrationservice.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@ToString
public class CommonModel implements Serializable {

  private String operation;

  private IntegrationApiModel apiModel;

  public void setApiModel(AccountModel apiModel) {
    this.apiModel = apiModel;
  }
}
