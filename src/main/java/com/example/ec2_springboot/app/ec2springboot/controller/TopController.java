package com.example.ec2_springboot.app.ec2springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

}
