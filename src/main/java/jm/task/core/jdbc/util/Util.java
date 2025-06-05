package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import org.hibernate.cfg.Configuration;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/firstLesson";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "84273823263";// реализуйте настройку соеденения с БД

    public Connection getConnection () {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e ) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка подключения к БД");
        }
    }
}
