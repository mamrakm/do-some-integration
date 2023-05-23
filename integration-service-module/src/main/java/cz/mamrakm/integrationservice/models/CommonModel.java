package cz.mamrakm.integrationservice.models;

public class CommonModel {

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

  public void setApiModel(IntegrationApiModel apiModel) {
    this.apiModel = apiModel;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }
}
