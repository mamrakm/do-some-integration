package cz.mamrakm.integrationservice;

import cz.mamrakm.integrationservice.models.AccountDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mapstruct.factory.Mappers;

@Slf4j
public class AccountProcessor implements Processor {
  @Override
  public void process(Exchange exchange) {
    log.trace("AccountProcessor.process(...)");

    log.trace("Get request body from exchange");
    AccountDTO accountModel = exchange.getIn().getBody(AccountDTO.class);

    log.trace(
        "Getting the instance of IntegrationAPIMapper.class using Mapstruct Mappers.getMapper(...)");
    log.debug("Mapping AccountModel JSON to AccountModel.java POJO");
    IntegrationAPIMapper integrationAPIMapper = Mappers.getMapper(IntegrationAPIMapper.class);

    log.info(
        ">>> id: {} firstname: {} - lastname: {} - updateDate: {} - message: {}",
        accountModel.getId(),
        accountModel.getFirstname(),
        accountModel.getLastname(),
        accountModel.getUpdatedAt(),
        exchange.getMessage());
    log.debug("Set response body to POJO returned by mapper");
    exchange.getIn().setBody(integrationAPIMapper.accountToCommon(accountModel));
  }
}
