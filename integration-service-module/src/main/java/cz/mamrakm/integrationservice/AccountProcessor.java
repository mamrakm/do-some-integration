package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountProcessor implements Processor {
  @Override
  public void process(Exchange exchange) {
    Logger logger = LoggerFactory.getLogger(AccountProcessor.class);
    AccountModel accountModel = exchange.getIn().getBody(AccountModel.class);
    IntegrationAPIMapper integrationAPIMapper = Mappers.getMapper(IntegrationAPIMapper.class);

    logger.info(
        ">>> id: {} firstname: {} - lastname: {} - updateDate: {} - message: {}",
        accountModel.getId(),
        accountModel.getFirstname(),
        accountModel.getLastname(),
        accountModel.getUpdatedAt(),
        exchange.getMessage());

    exchange.getIn().setBody(integrationAPIMapper.accountToCommon(accountModel));
  }
}
