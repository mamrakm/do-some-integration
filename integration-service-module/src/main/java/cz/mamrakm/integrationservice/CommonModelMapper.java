package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.dtos.AccountDTO;
import cz.mamrakm.integrationservice.models.CommonModel;
import org.mapstruct.Mapper;

@Mapper
public interface CommonModelMapper {

  default CommonModel accountToCommon(AccountDTO accountDTO) {
    CommonModel commonModel = new CommonModel();
    commonModel.setOperation("POST");
    commonModel.setApiModel(accountDTO);
    return commonModel;
  }
}
