package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.dtos.AccountDTO;
import cz.mamrakm.integrationservice.models.CommonModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CommonModelMapper {

    @Mapping(target = "CommonModel.apiModel")
    CommonModel accountToCommon(AccountDTO accountDTO);
}
