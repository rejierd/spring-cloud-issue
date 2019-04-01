package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "example", url = "http://example.com")
public interface FeignClientExample {
  @GetMapping(value = "/{id}", produces = "application/json")
  String exampleMethod(
      @PathVariable("id") String id,
      @RequestHeader(value = "Accept") String accept
  );
}
