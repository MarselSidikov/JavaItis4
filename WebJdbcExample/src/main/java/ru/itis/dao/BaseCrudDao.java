package ru.itis.dao;

import java.util.List;

/**
 * 15.05.2017
 * BaseCrudDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface BaseCrudDao<T> {
    T find(int id);
    void delete(int id);
    void update(T model);
    int save(T model);

    List<T> findAll();
}
