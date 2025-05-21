package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCenterTest {

    @Test
    void testShoppingCenterCreation() {
        ShoppingCenter mall = new ShoppingCenter(2000.0, 50, 5000000.0, 30);

        assertEquals(2000.0, mall.getArea(), 0.001, "Площадь ТЦ должна быть 2000.0 м²");
        assertEquals(50, mall.getNumberOfRooms(), "Количество комнат должно быть 50");
        assertEquals(5000000.0, mall.getPrice(), 0.001, "Цена ТЦ должна быть 5000000.0 $");
        assertEquals(30, mall.getNumberOfShops(), "Количество магазинов должно быть 30");
    }

    @Test
    void testAddShop() {
        ShoppingCenter mall = new ShoppingCenter(2000.0, 50, 5000000.0, 30);

        assertEquals(30, mall.getNumberOfShops(), "Начальное количество магазинов должно быть 30");

        mall.addShop();

        assertEquals(31, mall.getNumberOfShops(), "Количество магазинов должно увеличиться на 1");
        assertEquals(2000.0, mall.getArea(), 0.001, "Площадь не должна измениться");
        assertEquals(50, mall.getNumberOfRooms(), "Количество комнат не должно измениться");
        assertEquals(5000000.0, mall.getPrice(), 0.001, "Цена не должна измениться");
    }

    @Test
    void testCalculatePricePerSquareMeter() {
        ShoppingCenter mall = new ShoppingCenter(2000.0, 50, 5000000.0, 30);

        assertEquals(2500.0, mall.calculatePricePerSquareMeter(), 0.001,
                "Цена за квадратный метр рассчитана неверно");

        assertEquals(2000.0, mall.getArea(), 0.001, "Площадь не должна измениться");
        assertEquals(5000000.0, mall.getPrice(), 0.001, "Цена не должна измениться");
    }

    @Test
    void testToString() {
        ShoppingCenter mall = new ShoppingCenter(2000.0, 50, 5000000.0, 30);

        String expected = "ТЦ {площадь=2000.0 м², комнат=50, цена=5000000.0 $, магазинов=30}";
        assertEquals(expected, mall.toString(), "Неверное строковое представление");

        assertEquals(2000.0, mall.getArea(), 0.001, "Площадь не должна измениться");
        assertEquals(50, mall.getNumberOfRooms(), "Количество комнат не должно измениться");
        assertEquals(5000000.0, mall.getPrice(), 0.001, "Цена не должна измениться");
        assertEquals(30, mall.getNumberOfShops(), "Количество магазинов не должно измениться");
    }
}