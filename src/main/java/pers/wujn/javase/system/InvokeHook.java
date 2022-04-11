package pers.wujn.javase.system;


/**
 * @author wujunnan
 * @date 2021/11/18
 */
public class InvokeHook {

    static class MyHookInner {
        MyHookInner(Object obj){
            Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("test"+obj)));
        }
    }

    public static void main(String[] args) {
        //注册hook函数
        Object obj = new Object();
        System.out.println(obj);
        MyHookInner myHookInner = new MyHookInner(obj);
        //HookDO2 hookDO2 = new HookDO2();
        //System.out.println("hello");
    }
}
