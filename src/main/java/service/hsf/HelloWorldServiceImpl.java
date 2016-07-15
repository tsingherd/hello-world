package service.hsf;

import org.springframework.stereotype.Service;

/**
 * Created by guogen.lgg on 2016/7/13.
 */
@Service("HelloWorldServiceImpl")
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        return "hello : " + name;
    }
}
