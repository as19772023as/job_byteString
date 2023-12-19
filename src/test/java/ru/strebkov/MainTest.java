package ru.strebkov;


import org.junit.jupiter.api.*;


@DisplayName("Тесты на проверку числа")
public class MainTest {
    private static Main main;

    @BeforeAll
    static void beforeAll() {

        System.out.println("Start начало тестов");
        main = new Main();
    }

    @AfterEach
    void tearDown() {
        System.out.println("END Test !  Конец теста\n");
    }

    @DisplayName("Тест на число 3")
    @Test
    public void testFizzBizzString3() {
        Assertions.assertArrayEquals("Fizz".getBytes(), main.fizzBizzString(3));
    }

    @DisplayName("Тест на число 5")
    @Test
    public void testFizzBizzString5() {
        Assertions.assertArrayEquals(main.fizzBizzString(5), "Bizz".getBytes());
    }

    @DisplayName("Тест на число 3 и 5")
    @Test
    public void testFizzBizzString_When15_ThenFizzBizz() {
        Assertions.assertArrayEquals(main.fizzBizzString(15), "FizzBizz".getBytes());
    }

    @DisplayName("Тест на исключение 1")
    @Test
    public void testFizzBizzStringExeption1() {
       var exception =  Assertions.assertThrows(IllegalArgumentException.class, ()->{main.fizzBizzString(4);});
         Assertions.assertEquals("Число не подходит", exception.getMessage() );
    }
    @DisplayName("Тест на исключение 2")
    @Test
    public void testFizzBizzStringExeption2() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{main.fizzBizzString(1);});
    }

}