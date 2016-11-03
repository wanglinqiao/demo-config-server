package com.jyall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wang.linqiao on 2016/11/3.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApp.class,args);
    }
}
