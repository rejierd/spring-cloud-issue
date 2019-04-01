package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example")
public class ApplicationExample {
  @Autowired
  public FeignClientExample feignClientExample;

  public static void main(String[] args) {
    SpringApplication.run(ApplicationExample.class, args);
  }
}
