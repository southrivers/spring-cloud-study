package springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.service.fallback.ConsumerServiceImpl;

@FeignClient(value = "compute-service", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
