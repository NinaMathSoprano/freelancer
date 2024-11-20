package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {

    @Test
    public void testFreelancerCase1() {
//   Arrange-подготовка
//   Создадим объект нашего сервисного класса
     FreelancerService service = new FreelancerService();

//   Act-шаги
// мы у нашего сервиса вызываем метод
     int actual = service.calculate(10_000, 3_000, 20_000);
//   Asssert      -проверка ожидаемых результатов с полученными
     int expected = 3;
     Assertions.assertEquals( expected, actual );

    }

    @Test
    public void testFreelancerCase2() {
//   Arrange-подготовка
//   Создадим объект нашего сервисного класса
        FreelancerService service = new FreelancerService();

//   Act-шаги
// мы у нашего сервиса вызываем метод
        int actual = service.calculate(100_000, 60_000, 150_000);
//   Asssert      -проверка ожидаемых результатов с полученными
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}

