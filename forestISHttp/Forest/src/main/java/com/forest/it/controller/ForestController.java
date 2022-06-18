package com.forest.it.controller;

import com.dtflys.forest.annotation.Get;
import com.forest.it.forestIn.IForestApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/cloud")
@SuppressWarnings("all")
public class ForestController {
      private final IForestApi iForestApi;
      @GetMapping("/boot")
      public Map<String,Object> caseCloudboot(){
          Map bootCloud = iForestApi.getBootCloud();
          return bootCloud;
      }
}
