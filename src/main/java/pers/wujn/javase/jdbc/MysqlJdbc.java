package pers.wujn.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author wujunnan
 * @date 2021/11/07
 */
public class MysqlJdbc {

    public static void main(String[] args) throws ClassNotFoundException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/data_web";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "xxx";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("SHOW DATABASES")) {
                    System.out.println("通过列名来获取：");
                    //System.out.println("通过index来获取（从1开始）:");
                    while (resultSet.next()) {
                        //System.out.println(resultSet.getString(1));
                        System.out.println(resultSet.getString("Database"));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
