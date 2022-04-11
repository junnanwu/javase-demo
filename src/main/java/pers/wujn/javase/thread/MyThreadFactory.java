package pers.wujn.javase.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wujunnan
 * @date 2021/11/21
 */
public class MyThreadFactory implements ThreadFactory {

    private static final AtomicInteger threadNumber = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("创建新线程");
        String name = "测试线程";
        return new Thread(r, name + threadNumber.getAndIncrement());
    }
}
