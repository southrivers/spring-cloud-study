package com.huawei.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterCenter {

    public static void main(String[] args) {

        new SpringApplicationBuilder(RegisterCenter.class).web(true).run(args);
    }
}
