package ru.itis.dao;

import ru.itis.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 15.05.2017
 * UsersDaoJdbcImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersDaoJdbcImpl implements UsersDao {
    private Connection connection;

    public UsersDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID =
            "SELECT * FROM student WHERE id = ?";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM student";

    //language=SQL
    private final String SQL_SELECT_ALL_BY_AGE =
            "SELECT * FROM student WHERE age = ?";

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO student(age, name, height, style) VALUES(?, ?, ?, ?)";

    public User find(int id) {
        try {
            // создаем выражение для запроса из коннекта к БД
            PreparedStatement statement =
                    connection.prepareStatement(SQL_SELECT_USER_BY_ID);

            // положили параметр
            statement.setInt(1, id);

            // запустили запрос, получили результат - set
            ResultSet set = statement.executeQuery();

            // магия
            set.next();

            // из строки вытащили значения
            String name = set.getString("name");
            int age = set.getInt("age");
            int height = set.getInt("height");
            String style = set.getString("style");
            // создали пользователя, вернули как результат
            return new User(id, name, age, height, style);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<User> findAll() {
        try {
            List<User> users = new ArrayList<User>();
            PreparedStatement statement =
                    connection.prepareStatement(SQL_SELECT_ALL);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                int age = set.getInt("age");
                int height = set.getInt("height");
                String style = set.getString("style");
                User newUser = new User(id, name, age, height, style);
                users.add(newUser);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void delete(int id) {

    }

    public void update(User model) {

    }

    public int save(User model) {
        try {
            String generatedColumns[] = { "id" };
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER, generatedColumns);
            statement.setInt(1, model.getAge());
            statement.setString(2, model.getName());
            statement.setInt(3, model.getHeight());
            statement.setString(4, model.getStyle());
            // в insertedRows количество изменненных строк
            int insertedRows = statement.executeUpdate();
            // получили множество сгенерированных ключей
            ResultSet generatedKeys = statement.getGeneratedKeys();
            // магия
            generatedKeys.next();

            int generatedId = generatedKeys.getInt(1);
            model.setId(generatedId);
            return generatedId;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<User> findAllByAge(int age) {
        try {
            List<User> users = new ArrayList<User>();
            PreparedStatement statement =
                    connection.prepareStatement(SQL_SELECT_ALL_BY_AGE);

            statement.setInt(1, age);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                int height = set.getInt("height");
                String style = set.getString("style");
                User newUser = new User(id, name, age, height, style);
                users.add(newUser);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
