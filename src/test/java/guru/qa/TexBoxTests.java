package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TexBoxTests {
    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");
    }

}
