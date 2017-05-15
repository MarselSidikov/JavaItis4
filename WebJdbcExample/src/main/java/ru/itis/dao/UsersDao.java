package ru.itis.dao;

import ru.itis.User;

import java.util.List;

/**
 * 15.05.2017
 * UsersDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersDao extends BaseCrudDao<User> {
    List<User> findAllByAge(int age);
}
