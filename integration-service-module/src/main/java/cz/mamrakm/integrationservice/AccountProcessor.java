package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mapstruct.factory.Mappers;

@Slf4j
public class AccountProcessor implements Processor {
  @Override
  public void process(Exchange exchange) {
    AccountModel accountModel = exchange.getIn().getBody(AccountModel.class);
    IntegrationAPIMapper integrationAPIMapper = Mappers.getMapper(IntegrationAPIMapper.class);

    log.info(
        ">>> id: {} firstname: {} - lastname: {} - updateDate: {} - message: {}",
        accountModel.getId(),
        accountModel.getFirstname(),
        accountModel.getLastname(),
        accountModel.getUpdatedAt(),
        exchange.getMessage());

    exchange.getIn().setBody(integrationAPIMapper.accountToCommon(accountModel));
  }
}
