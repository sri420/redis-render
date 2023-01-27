package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {


@Cacheable(value = "users", key = "#userId")
@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
public String getUser(@PathVariable String userId) {
  System.out.println("Getting user with ID :" + userId);
  return "Welcome";
}

}