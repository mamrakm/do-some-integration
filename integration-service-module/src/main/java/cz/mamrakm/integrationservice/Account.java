package cz.mamrakm.integrationservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import cz.mamrakm.integrationservice.model.IntegrationApiModel;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends IntegrationApiModel {
    private Long id;

    private String firstname;

    private String lastname;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
}
