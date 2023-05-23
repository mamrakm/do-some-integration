package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountModel;
import cz.mamrakm.integrationservice.models.CommonModel;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface IntegrationAPIMapper {

  default CommonModel accountToCommon(@NonNull AccountModel accountModel) {
    CommonModel commonModel = new CommonModel();
    commonModel.setOperation("PostAccount");
    commonModel.setApiModel(accountModel);
    return commonModel;
  }
}
