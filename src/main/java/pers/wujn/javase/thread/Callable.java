package pers.wujn.javase.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 测试有返回指的callable
 *
 * @author wujunnan
 * @date 2021/11/21
 */
public class Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            System.out.println("开始任务...");
            Thread.sleep(2000);
            throw new Exception("出现异常！！！");
        });
        Thread thread = new Thread(futureTask);
        thread.start();

        /*try {
            System.out.println("结果为：" + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }*/

        while (true){
            if(futureTask.isDone()){
                System.out.println("执行到这里");
                System.out.println("结果为：" + futureTask.get());
                break;
            }
        }

        /*while (futureTask.isDone()) {
            try {
                System.out.println("结果为：" + futureTask.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }*/
    }
}
