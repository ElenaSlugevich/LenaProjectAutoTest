package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public SelenideElement login = $("input[name='login']"); //в поле Логин ввести jd
    SelenideElement password = $("input[type='password']"); // в поле Пароль ввести q1
    public SelenideElement submit = $x(".//a[contains(@class, 'x-btn')][.//span[text()='Войти']]"); // нажать кнопку Войти

    public void login() {
        login.sendKeys("jd");
        password.sendKeys("q1");
        submit.click();
    }

    public void loginAgain() {
        password.sendKeys("q1");
        sleep(3000);
        submit.click();
    }

}
