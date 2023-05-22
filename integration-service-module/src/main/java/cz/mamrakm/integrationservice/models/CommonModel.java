package cz.mamrakm.integrationservice.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class CommonModel {

    private String operation;

    private IntegrationApiModel apiModel;

}