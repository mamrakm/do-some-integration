package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.dtos.AccountDTO;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountProcessor implements Processor {
  @Override
  public void process(Exchange exchange) {
    Logger logger = LoggerFactory.getLogger(AccountProcessor.class);
    CommonModelMapper commonModelMapper = Mappers.getMapper(CommonModelMapper.class);
    AccountDTO integrationApiModel = AccountDTO.class.cast(exchange.getMessage().getBody());
    logger.info(">>> body: {}", integrationApiModel.getFirstname());
  }
}
