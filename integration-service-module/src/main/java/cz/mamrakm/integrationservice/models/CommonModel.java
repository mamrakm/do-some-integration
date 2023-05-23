package cz.mamrakm.integrationservice.models;

import java.io.Serializable;

public class CommonModel implements Serializable {

  private String operation;

  private IntegrationApiModel apiModel;

  public CommonModel() {}

  public CommonModel(String operation, IntegrationApiModel model) {
    this.operation = operation;
    this.apiModel = model;
  }

  public IntegrationApiModel getApiModel() {
    return apiModel;
  }

  public void setApiModel(AccountModel apiModel) {
    this.apiModel = apiModel;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }
}
