package pers.wujn.javase.structured;

/**
 * @author wujunnan
 * @date 2021/11/18
 */
public class ForLoop {
    public static void main(String[] args) {
        //continue是跳过本次循环
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        //while循环中continue，不起作用
        for (int i = 0; i < 10; i++) {
            //while (i == 3) {
            //    continue;
            //}
            System.out.println(i);
        }

        System.out.println("-------------------------");

        //可以给for循环起个名字，continue + 名字跳出外层循环
        loop:
        for (int i = 0; i < 10; i++) {
            while (i == 3) {
                continue loop;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        //跳出内层for循环
        outLoop:
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (j == 8) {
                    continue outLoop;
                }
                System.out.print(j);
            }
        }

        System.out.println();
        System.out.println("-------------------------");

        //break直接退出for循环
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
