package cz.mamrakm.integrationservice;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mapstruct.factory.Mappers;

@Slf4j
@Builder
@ToString
public class AccountProcessor implements Processor {
    @Override
    public void process(Exchange exchange) {
        CommonModelMapper commonModelMapper= Mappers.getMapper(CommonModelMapper.class);
        log.info(">>> body: {}", exchange.getMessage().getBody().toString());
    }
}
