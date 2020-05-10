package com.example.ec2_springboot.app.ec2springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

  @Value("${app.env}")
  private String appEnv;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("appEnv", appEnv);
    return "index";
  }

}
