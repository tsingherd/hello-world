package service.concurrence;

/**MethodRequest的实现，请求实现类
 * Created by guogen.lgg on 2016/7/6.
 */
public class SayHello implements MethodRequest {
    private Service _service;
    public SayHello(Service s) {
        _service = s;
    }
    //请求方法
    public void call() {
        _service.sayHello();
    }
}
