package com.tony;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author fut
 * @Date 2018-11-26
 * @Description TODO
 * @Wiki:
 */
@SpringBootApplication
@EnableEurekaServer
public class TonyApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TonyApplication.class).web(true).run(args);
    }
}
