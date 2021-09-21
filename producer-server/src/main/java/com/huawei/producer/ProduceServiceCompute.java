package com.huawei.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ProduceServiceCompute {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ProduceServiceCompute.class).web(true).run(args);
    }
}
