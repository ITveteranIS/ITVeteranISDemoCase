package com.it.controller;

import com.it.utils.TextToSpeechIS;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/voice")
@RestController
@Slf4j
public class VoiceController {
    @GetMapping("/tests")
    @SneakyThrows
    public Object tests(@RequestParam("txt") String txt){
        TextToSpeechIS.textToSpeech(txt);
        return txt;
    }

}
