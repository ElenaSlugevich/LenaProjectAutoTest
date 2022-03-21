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
        Configuration.timeout = 20000;

        $("input[name='login']").sendKeys("jd");
        $("input[type='password']").sendKeys("q1");
        $x("//*[@id=\"button-1015-btnInnerEl\"]").click();
        $x("//*[@id=\"ext-element-114\"]").click();
        $("a[class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-soft-green-small']").click();
        $("input[data-ref='inputEl']").sendKeys("Тест1");









        //$x("//*[//*[@id=\"button-1078-btnIconEl\"]").click();
        //sleep(20000);
        //$x("//a[.//span[text()='Войти']]").click();

        //$x("//a[.//span[text()='Войти']][not(contains(@class, 'x-btn-disabled'))]").click();

        //$("input[type='password']").pressEnter();
        //$x("//a[.//span[text()='Войти']]").click();

        //element(byName("login")).setValue("jd");
        //element(byName("password")).setValue("q1").pressEnter();
        //$("*[name='login']").setValue("jd");
        //$("*[name='password']").setValue("q1").pressEnter();
        //Configuration.timeout = 60;

       //element(byName("login")).setValue("jd");
       //element(byName("password")).setValue("q1").pressEnter();
       //Configuration.timeout = 60;
       //$("//*[@id=\"button-1015-btnEl\"]").shouldHave(text("Войти")).pressEnter();
       ;
       //pressEnter();
       

    }
}

