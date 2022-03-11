import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

public class JdClassTest {
    @Test
    public static void main(String[] args) {
        Configuration.holdBrowserOpen = true;
        open("https://gvm220.lpr.jet.msk.su/");

        element(byName("login")).setValue("jd");
        element(byName("password")).setValue("q1");
        $x("//a[.='Войти']").shouldBe(Condition.enabled).click();
    }
}

