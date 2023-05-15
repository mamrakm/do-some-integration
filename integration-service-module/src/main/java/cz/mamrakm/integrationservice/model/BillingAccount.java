package cz.mamrakm.integrationservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import lombok.Data;

@Data
public class BillingAccount {

    private Long id;

    private String name; /* firstname + lastname */

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastUpdate;

}