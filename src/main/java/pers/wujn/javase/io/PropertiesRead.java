package pers.wujn.javase.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author wujunnan
 * @date 2021/11/18
 */
public class PropertiesRead {
    public static void main(String[] args) {
        //方案一
        //读取classpath下的东西很方便
        Properties properties = new Properties();
        InputStream inputStream = PropertiesRead.class.getClassLoader().getResourceAsStream("test.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("password"));

        //方案二 java.util.ResourceBundle, 此中方法更简便
        ResourceBundle bundle = ResourceBundle.getBundle("test");
        System.out.println(bundle.getString("name"));
        System.out.println(bundle.getString("password"));

    }
}
