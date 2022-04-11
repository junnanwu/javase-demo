package pers.wujn.javase.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wujunnan
 * @date 2022/02/22
 */
public class ExecuteCommand {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("pwd");
        process.waitFor();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        StringBuffer stringBuffer = new StringBuffer();
        while (null != (line = bufferedReader.readLine())){
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
    }
}
