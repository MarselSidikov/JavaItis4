package ru.itis.storages;

import org.junit.Before;
import org.junit.Test;
import ru.itis.factory.DataStorageFactory;
import ru.itis.id.IdGenerator;
import ru.itis.id.IdGeneratorImpl;
import ru.itis.models.Human;

import static org.junit.Assert.assertEquals;

/**
 * 19.04.2017
 * HumansDataStorageFileBasedImplTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansDataStorageFileBasedImplTest {

    HumansDataStorageFileBasedImpl humansDataStorage;

    @Before
    public void setUp() throws Exception {
        humansDataStorage = DataStorageFactory.getHumansDataStorage("test");
    }

    @Test
    public void findTest() throws Exception {
        Human actual = humansDataStorage.find(1);
        Human expected = new Human(1, "Guzel", 18);
        assertEquals(expected, actual);
    }

}