package pers.wujn.javase.system;

/**
 * @author wujunnan
 * @date 2021/11/18
 */
public class MyHook {
    MyHook(){
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("I am hook")));
    }
}
