package service.hsf;

/**
 * Created by guogen.lgg on 2016/7/13.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        return "hello : " + name;
    }
}
