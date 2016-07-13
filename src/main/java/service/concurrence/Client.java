package service.concurrence;

/**
 * Created by guogen.lgg on 2016/7/6.
 */
public class Client {
    private Service _service;
    public Client(Service s) {
        _service = s;
    }
    public void requestService() {
        _service.sayHello();
    }
}
