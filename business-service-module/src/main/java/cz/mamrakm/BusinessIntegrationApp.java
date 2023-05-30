package cz.mamrakm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@ImportResource("classpath:camel-context.xml")
@SpringBootApplication
public class BusinessIntegrationApp {
  public static void main(String[] args) {
    SpringApplication.run(BusinessIntegrationApp.class, args);
    log.info(">>>BusinessServiceApplication started");
  }
}
