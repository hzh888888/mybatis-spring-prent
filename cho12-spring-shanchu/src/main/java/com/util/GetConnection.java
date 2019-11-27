package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

    private static Connection connection;
    private static  final String URL="jdbc:mysql://localhost:3306/demo";
    private  static final String USER="root";
    private static  final String PWD="1234";
    private  static final String DRIVER="com.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("加载驱动失败");
        }
    }

    public static Connection getConnection(){
         connection=null;
        try {
            connection= DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接失败");
        }
        return connection;
    }
}
