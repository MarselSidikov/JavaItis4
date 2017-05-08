package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 08.05.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String user = "postgres";
        String password = "qwerty007";
        String url = "jdbc:postgresql://localhost:5432/itis_shcolota";

        Connection connection =
                DriverManager.getConnection(url, user, password);

        String SELECT_ALL_STUDENTS = "SELECT * FROM student WHERE age > 16";

        PreparedStatement statement = connection.prepareStatement(SELECT_ALL_STUDENTS);

        ResultSet allStudents = statement.executeQuery();

        while (allStudents.next()) {
            System.out.println(
                    allStudents.getInt("id") + " " +
                            allStudents.getString("name") + " " +
                            allStudents.getInt("age") + " " +
                            allStudents.getInt("height")
            );
        }


    }
}
