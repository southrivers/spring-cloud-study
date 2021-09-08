package springcloud.service.fallback;

import org.springframework.stereotype.Component;
import springcloud.service.ConsumerService;

@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String add(Integer a, Integer b) {
        return "something wrong";
    }
}
