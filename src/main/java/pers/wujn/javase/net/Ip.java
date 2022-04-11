package pers.wujn.javase.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wujunnan
 * @date 2022/01/13
 */
public class Ip {
    public static void main(String[] args) throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip);
    }
}
