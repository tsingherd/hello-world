package service.concurrence;

/**线程对象
 * Created by guogen.lgg on 2016/7/6.
 */
public class ActiveObject  extends Thread {
    private ActiveQueue _queue;
    public ActiveObject() {
        _queue = new ActiveQueue();
        start();
    }
    public void enqueue(MethodRequest mr) {
        _queue.enqueue(mr);
    }
    public void run() {
        while(true) {
            MethodRequest mr = _queue.dequeue();
            mr.call();
        }
    }
}
