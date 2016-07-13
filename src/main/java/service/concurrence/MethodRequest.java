package service.concurrence;

/**主要用来封装调用者的请求，Command设计模式的一种实现方式
 * Created by guogen.lgg on 2016/7/6.
 */
public interface MethodRequest {
    public void call();
}
