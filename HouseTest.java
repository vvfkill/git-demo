package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void testHouseCreation() {
        House house = new House(120.5, 4, 250000.0, true);

        // Проверка всех полей
        assertEquals(120.5, house.getArea(), 0.001, "Площадь должна быть 120.5 м²");
        assertEquals(4, house.getNumberOfRooms(), "Количество комнат должно быть 4");
        assertEquals(250000.0, house.getPrice(), 0.001, "Цена должна быть 250000.0 $");
        assertTrue(house.hasGarden(), "Дом должен иметь сад");
    }

    @Test
    void testPlantGarden() {
        House house = new House(100.0, 3, 200000.0, false);
        assertFalse(house.hasGarden(), "Изначально сада не должно быть");
        house.plantGarden();
        assertTrue(house.hasGarden(), "После вызова plantGarden() сад должен появиться");
        assertEquals(100.0, house.getArea(), 0.001, "Площадь не должна измениться");
        assertEquals(3, house.getNumberOfRooms(), "Количество комнат не должно измениться");
        assertEquals(200000.0, house.getPrice(), 0.001, "Цена не должна измениться");
    }

    @Test
    void testIncreaseArea() {
        House house = new House(100.0, 3, 200000.0, false);
        assertEquals(100.0, house.getArea(), 0.001, "Начальная площадь должна быть 100.0 м²");
        house.increaseArea(50.0);

        assertEquals(150.0, house.getArea(), 0.001, "Площадь должна увеличиться на 50.0 м²");
        assertEquals(3, house.getNumberOfRooms(), "Количество комнат не должно измениться");
        assertEquals(200000.0, house.getPrice(), 0.001, "Цена не должна измениться");
        assertFalse(house.hasGarden(), "Сад не должен появиться");
    }

    @Test
    void testToString() {
        House house = new House(100.0, 3, 200000.0, true);

        String expected = "Дом {площадь=100.0 м², комнат=3, цена=200000.0 $, сад=есть}";
        assertEquals(expected, house.toString(), "Строковое представление не соответствует ожидаемому");

        assertEquals(100.0, house.getArea(), 0.001, "Площадь не должна измениться");
        assertEquals(3, house.getNumberOfRooms(), "Количество комнат не должно измениться");
        assertEquals(200000.0, house.getPrice(), 0.001, "Цена не должна измениться");
        assertTrue(house.hasGarden(), "Сад должен остаться");
    }
}