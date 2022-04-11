package pers.wujn.javase.thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试一下线程工厂，指定线程名字
 *
 * @author wujunnan
 * @date 2021/11/21
 */
public class ThreadFactoryApply {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(), new MyThreadFactory());
        threadPoolExecutor.execute(() -> {
            System.out.println("任务1开始...");
            Thread t = Thread.currentThread();
            System.out.println("线程名字为：" + t.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务1结束...");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println("任务2开始...");
            Thread t = Thread.currentThread();
            System.out.println("线程名字为：" + t.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务2结束...");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println("任务3开始...");
            Thread t = Thread.currentThread();
            System.out.println("线程名字为：" + t.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务3结束...");
            System.exit(0);
        });
    }
}
