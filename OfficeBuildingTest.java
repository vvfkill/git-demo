package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OfficeBuildingTest {

    @Test
    void testOfficeBuildingCreation() {
        OfficeBuilding office = new OfficeBuilding(500.0, 20, 1000000.0, 5);

        assertEquals(500.0, office.getArea(), 0.001, "Неверная площадь здания");
        assertEquals(20, office.getNumberOfRooms(), "Неверное количество комнат");
        assertEquals(1000000.0, office.getPrice(), 0.001, "Неверная стоимость здания");
        assertEquals(5, office.getNumberOfFloors(), "Неверное количество этажей");
    }

    @Test
    void testAddFloor() {
        OfficeBuilding office = new OfficeBuilding(500.0, 20, 1000000.0, 5);

        assertEquals(5, office.getNumberOfFloors(), "Начальное количество этажей не совпадает");

        office.addFloor();

        assertEquals(6, office.getNumberOfFloors(), "Количество этажей не увеличилось");

        assertEquals(500.0, office.getArea(), 0.001, "Площадь не должна изменяться");
        assertEquals(20, office.getNumberOfRooms(), "Количество комнат не должно изменяться");
        assertEquals(1000000.0, office.getPrice(), 0.001, "Стоимость не должна изменяться");
    }

    @Test
    void testRentOut() {
        OfficeBuilding office = new OfficeBuilding(500.0, 20, 1000000.0, 5);

        assertDoesNotThrow(() -> office.rentOut(), "Метод rentOut() должен работать без исключений");

        assertEquals(500.0, office.getArea(), 0.001, "Площадь не должна изменяться");
        assertEquals(20, office.getNumberOfRooms(), "Количество комнат не должно изменяться");
        assertEquals(1000000.0, office.getPrice(), 0.001, "Стоимость не должна изменяться");
        assertEquals(5, office.getNumberOfFloors(), "Количество этажей не должно изменяться");
    }

    @Test
    void testToString() {
        OfficeBuilding office = new OfficeBuilding(500.0, 20, 1000000.0, 5);

        String expected = "Офис {площадь=500.0 м², комнат=20, цена=1000000.0 $, этажей=5}";
        assertEquals(expected, office.toString(), "Неверный формат строкового представления");

        assertEquals(500.0, office.getArea(), 0.001, "Площадь не должна изменяться");
        assertEquals(20, office.getNumberOfRooms(), "Количество комнат не должно изменяться");
        assertEquals(1000000.0, office.getPrice(), 0.001, "Стоимость не должна изменяться");
        assertEquals(5, office.getNumberOfFloors(), "Количество этажей не должно изменяться");
    }
}