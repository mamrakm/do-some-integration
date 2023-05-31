package cz.mamrakm.integrationservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@ImportResource("classpath:camel-context.xml")
@SpringBootApplication
public class IntegrationServiceApplication {

  public static void main(String[] args) {
    log.info(">>>IntegrationServiceApplication starting...");
    SpringApplication.run(IntegrationServiceApplication.class, args);
  }
}
