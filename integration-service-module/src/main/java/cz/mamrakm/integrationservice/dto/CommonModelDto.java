package cz.mamrakm.integrationservice.dto;

import cz.mamrakm.integrationservice.model.IntegrationApiModel;
import lombok.Data;

@Data
public class CommonModelDto {

    private String operation;

    private IntegrationApiModel apiModel;

}