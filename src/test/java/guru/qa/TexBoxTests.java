package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.name;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTests {


    @AfterAll()
    static void setUp(){
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");
        String name = "Anton Vlasov";

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("Anton@Vlasov.ru");
        $("[id=currentAddress]").setValue("Georgia");
        $("[id=permanentAddress]").setValue("Russia");
        $("[id=submit]").click();


//        $("[id=output]").shouldHave(text(name),text("Anton@Vlasov.ru"),text("Georgia"),
//        text("Russia"));
//        $("[id=output] [id=name]").shouldHave(text(name));
//        $("[id=output]").$("[id=name]").shouldHave(text(name));
//        $("[id=permanentAddress]", 1).shouldHave(text("Permananet Address :Russia"));
//        $("p[id=permanentAddress]").shouldHave(text("Permananet Address :Russia"));



    }

}
