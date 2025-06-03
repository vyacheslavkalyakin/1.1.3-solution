package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/firstLesson";
    private static final String username = "root";
    private static final String password = "84273823263";// реализуйте настройку соеденения с БД

    public Connection getConnection () {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e ) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка подключения к БД");
        }
    }
}
