package springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.service.ConsumerService;

@RestController
@RefreshScope
public class ConsumerController {


    @Value("${from}")
    private String from;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackAdd")
    public String add() {
        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
    }

    public String fallbackAdd() {
        return "error";
    }

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/add-1", method = RequestMethod.GET)
    public String add1(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return consumerService.add(a, b);
    }

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        return this.from;
    }
}
