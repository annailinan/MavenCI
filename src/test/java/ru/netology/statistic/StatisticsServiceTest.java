package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual1 = service.findMax(incomesInBillions);

        assertEquals(expected, actual1);
    }

    @Test
    void FindMax2() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions2 = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 16};
        long expected2 = 16;

        long actual2 = service.findMax(incomesInBillions2);
        Assertions.assertEquals(expected2, actual2);
    }
}
