package pers.wujn.javase.exception;

/**
 * @author wujunnan
 * @date 2021/12/28
 */
public class ExceptionExecutionOrder {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            System.out.println("1");
            return;
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
