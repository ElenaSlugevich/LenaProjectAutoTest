import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

public class JdClassTest {
    @Test
    public static void main(String[] args) {
        Configuration.holdBrowserOpen = true;
        open("https://avm14.lpr.jet.msk.su/");

       element(byName("login")).setValue("jd");
       element(byName("password")).setValue("q1").pressEnter();

    }
}

