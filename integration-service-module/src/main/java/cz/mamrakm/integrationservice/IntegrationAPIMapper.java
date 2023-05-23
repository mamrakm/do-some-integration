package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountModel;
import cz.mamrakm.integrationservice.models.CommonModel;
import org.mapstruct.Mapper;

@Mapper
public interface IntegrationAPIMapper {

  default CommonModel accountToCommon(AccountModel accountModel) {
    CommonModel commonModel = new CommonModel();
    commonModel.setOperation("PostAccount");
    commonModel.setApiModel(accountModel);
    return commonModel;
  }
}
