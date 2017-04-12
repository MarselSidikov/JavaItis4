package ru.itis.storages;

import ru.itis.models.Human;

import java.util.List;

public interface HumansDataStorage extends BaseDataStorage<Human> {
    List<Human> findAllByName(String name);
}
