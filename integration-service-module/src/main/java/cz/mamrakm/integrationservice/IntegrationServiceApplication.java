package cz.mamrakm.integrationservice;

import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:integration-bean.xml")
@SpringBootApplication
public class IntegrationServiceApplication {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(IntegrationServiceApplication.class);

    SpringApplication.run(IntegrationServiceApplication.class, args);
    logger.info("IntegrationServiceApplication started");
  }

  @Bean
  public Processor getAccountProcessorBean() {
    return new AccountProcessor();
  }
}
