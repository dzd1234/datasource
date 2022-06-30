package com.dzd.test.controller;

import com.dzd.test.entity.Test;
import com.dzd.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



@Autowired
TestService testService;

@GetMapping("/query")
public Test getContent(@RequestParam String id) {
 return testService.getContent(id);
 }

@GetMapping("/write")
public int writeContent() {

 return testService.writeContent();

 }
}
