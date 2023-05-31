package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountDTO;
import cz.mamrakm.integrationservice.models.CommonDTO;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper
public interface IntegrationAPIMapper {

  default CommonDTO accountToCommon(@NonNull AccountDTO accountModel) {
    CommonDTO commonDTO = new CommonDTO();
    commonDTO.setOperation("PostAccount");
    commonDTO.setApiModel(accountModel);
    return commonDTO;
  }
}
