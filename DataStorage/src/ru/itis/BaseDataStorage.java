package ru.itis;

public interface BaseDataStorage<T> {
    /**
     * Сохранение модели
     * @param model модель
     * @return идентификатор модели
     */
    int save(T model);

    /**
     * Удаление модели из хранилища по идентификатору
     * @param id идентификатор удалемой модели
     */
    void delete(int id);

    /**
     * Найти модель по идентификатору
     * @param id идентификатор модели
     * @return модель
     */
    T find(int id);

    /**
     * Обновить модель
     * @param model обновляемые данные модели
     */
    void update(T model);
}
