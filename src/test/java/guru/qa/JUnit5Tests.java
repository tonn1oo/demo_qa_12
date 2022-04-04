package guru.qa;

import org.junit.jupiter.api.*;

public class JUnit5Tests {

    @BeforeAll()
    static void initDB(){
        System.out.println("###   @BeforeAll");
    }

    @BeforeEach()
    void openYaPage(){
        System.out.println("###         @BeforeEach");
       // Selenide.open("https://ya.ru");
    }

    @AfterEach()
    void close() {
        System.out.println("###         @AfterEach");
     //   WebDriverRunner.closeWindow();
    }
    @AfterAll()
    static void cleanDB(){
        System.out.println("###   @AfterAll");
    }

    @Test
    void assertTest() {
        System.out.println("###                @test0");
        ///


    }
    @Test
    void assertTest2() {
        System.out.println("###                @test1");
        ///

    }

    @Test
    void assertTest3(){
        System.out.println("###                @test2");
        ///
    }
}
