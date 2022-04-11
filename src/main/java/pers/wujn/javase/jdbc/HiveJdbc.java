package pers.wujn.javase.jdbc;

import java.sql.*;

/**
 * @author wujunnan
 * @date 2021/11/28
 */
public class HiveJdbc {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    //private static final Logger log = Logger.getLogger(HiveJdbcTest.class);

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        //replace "hive" here with the name of the user the queries should run as
        //log.info("准备获取连接...");
        System.out.println("准备获取连接...");
        Connection con = DriverManager.getConnection("jdbc:hive2://xxx:7001/default;?hive.server2.session.check.interval=60000;hive.server2.idle.operation.timeout=1800000;hive.server2.idle.session.timeout=2400000#", "dataweb", "xxx");
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery("show databases");
        if (res.next()) {
            System.out.println(res.getString(1));
        }
    }
}
