package cz.mamrakm.businessservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:camel-context.xml")
@SpringBootApplication
public class BusinessServiceApp {
  public static void main(String[] args) {
    SpringApplication.run(BusinessServiceApp.class, args);
  }
}
