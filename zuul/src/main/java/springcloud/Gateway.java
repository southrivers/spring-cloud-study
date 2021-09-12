package springcloud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 */

@EnableZuulProxy
@SpringCloudApplication
public class Gateway {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Gateway.class).web(true).run(args);
    }
}
