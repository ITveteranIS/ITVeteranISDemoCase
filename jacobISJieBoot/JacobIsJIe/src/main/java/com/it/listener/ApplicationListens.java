package com.it.listener;

import com.it.utils.TextToSpeechIS;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.ExceptionUtils;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author liuhui
 * @date 2021-08-30 12:30
 * @description
 */
@Slf4j
@Component
public class ApplicationListens implements CommandLineRunner, DisposableBean {
    @Override
    public void destroy(){
        log.info("---------------程序中止，关闭串口-------------");
//        SerialPortUtils serialPort = SerialPortUtils.getInstance();
//        serialPort.closeSerialPort();
    }

    @Override
    @SneakyThrows
    public void run(String... args){
        log.info("---------------程序启动-------------");
        TextToSpeechIS.textToSpeech("项目启动成功");
    }
}
