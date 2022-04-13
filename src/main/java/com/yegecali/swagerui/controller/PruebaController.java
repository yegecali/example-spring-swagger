package com.yegecali.swagerui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PruebaController {
  @GetMapping
  public ResponseEntity<Map<String, String>> pruebaController(){
    Map<String, String> res = new HashMap<>();
    res.put("message", "any message");
    return ResponseEntity.ok(res);
  }
}
