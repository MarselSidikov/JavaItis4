import ru.itis.User;
import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoJdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 * 15.05.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itis_shcolota",
                "postgres", "qwerty007");
        UsersDao usersDao = new UsersDaoJdbcImpl(connection);
        User karim = usersDao.find(5);
        System.out.println(karim);
        List<User> users = usersDao.findAll();
        users = usersDao.findAllByAge(16);
        User user = new User("Alehandro", 95, 134, "fail");
        usersDao.save(user);
        System.out.println(users);
        System.out.println(user);


    }
}
