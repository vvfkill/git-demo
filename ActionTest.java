package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    @Test
    void testEnumValues() {

        assertEquals(12, Action.values().length, "Должно быть 12 элементов перечисления");
        assertEquals("Построить дом", Action.BUILD_HOUSE.getDescription(),
                "Неверное описание для BUILD_HOUSE");
        assertEquals("Выйти", Action.EXIT.getDescription(),
                "Неверное описание для EXIT");

        for (Action action : Action.values()) {
            assertNotNull(action.getDescription(),
                    "Описание действия " + action.name() + " не должно быть null");
            assertFalse(action.getDescription().isEmpty(),
                    "Описание действия " + action.name() + " не должно быть пустым");
        }
    }

    @Test
    void testToString() {
        assertEquals("Построить дом", Action.BUILD_HOUSE.toString(),
                "Неверное строковое представление для BUILD_HOUSE");
        for (Action action : Action.values()) {
            assertEquals(action.getDescription(), action.toString(),
                    "Для действия " + action.name() + " toString() должен возвращать то же значение, что и getDescription()");
        }
    }

    @Test
    void testEnumOrder() {
        Action[] values = Action.values();
        assertEquals(Action.BUILD_HOUSE, values[0],
                "Первый элемент перечисления должен быть BUILD_HOUSE");
        assertEquals(Action.EXIT, values[values.length - 1],
                "Последний элемент перечисления должен быть EXIT");
    }
}