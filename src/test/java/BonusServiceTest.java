import Netology.BonusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static java.lang.System.*;


public class BonusServiceTest {

    @Test
    void OneshouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
        if (actual == expected) {
            out.println("Test 1 - ok");};
    }

    @Test
    void TwoshouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // ввод данных:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидание и факт):
        Assertions.assertEquals(expected, actual);
         if (actual == expected) {
             out.println("Test 2 - ok");};
    }
   @Test
   void TreeshouldCalculateForUNRegisteredAndUnderLimit() {
       BonusService service = new BonusService();

        // ввод данных:
       long amount = 1000;
       boolean registered = false;
       long expected = 10;

        // вызываем целевой метод:
       long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидание и факт):
       Assertions.assertEquals(expected, actual);
       if (actual == expected) {
           out.println("Test 3 - ok");};
    }
    @Test
    void FourshouldCalculateForUNRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // ввод данных:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидание и факт):
        Assertions.assertEquals(expected, actual);
        if (actual == expected) {
            out.println("Test 4 - ok");};
    }

        }


