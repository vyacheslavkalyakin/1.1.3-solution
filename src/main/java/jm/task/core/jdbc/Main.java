package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("ваня", "мылин", (byte) 25);
        List<User> users = userDao.getAllUsers();
        users.forEach(System.out::println);

        userDao.cleanUsersTable();
        userDao.dropUsersTable();// реализуйте алгоритм здесь
    }
}
