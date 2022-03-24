package сreateBomObjectTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.ExitJd;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.Math.random;

public class CreateDirObjectTest {

    LoginPage loginPage = new LoginPage(); // объявили переменную loginpage
    ExitJd exitJd = new ExitJd(); // объявили переменную exitJd

    @Test
    public void test3 () {
        Configuration.holdBrowserOpen = true;
        open("https://avm14.lpr.jet.msk.su/"); //открыть в баузере указанную страницу
        Configuration.timeout = 60000;

        loginPage.login(); // вызвали метод логин

        $x("//*[@id=\"ext-element-114\"]").click(); // Перейти в объектная модель - Объекты
        $("a[class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-soft-green-small']").click(); // нажать кнопку Добавить
        sleep(2000);
        $x(".//div[contains(@class, 'x-field')][.//label[.//span[text()='Тип']]]//input").click(); // На форме "Новый объект" открыть выпадающий список в поле "Тип"
        $x(".//li[text()='Справочник']").click(); // В выпадающем списке в поле "Тип" выбрать Справочник
        String value = "Lena_DIR_SELENIDE" + random(); // объявила переменную value
        $x("//div[contains(@class, 'x-field')][.//label[.//span[text()='Наименование']]]//input").sendKeys(value); // В поле "Наименование" ввести значение переменной value
        sleep(2000);
        $x("//span[@class='x-btn-button x-btn-button-soft-blue-small x-btn-text    x-btn-button-center ']").click(); // Нажать на кнопку Создать
        sleep(8000);
        $x("//a[contains(@class, 'x-tab')][.//span[text()='Список объектов']]").click(); // Перейти на вкладку "Список объектов"
        $x(".//table[.//span[@class='x-grid-checkcolumn']][.//td[.//div[text()='" + value + "']]]").click(); // В списке объектов выбрать созданный объект
        $x(".//a[@data-qtip='Применить изменения']").click(); // Нажать кнопку Применить изменения
        $x(".//span[text()='Да']").click(); // В модальном окне подтверждения нажать "Да"
        sleep(2000); // Ждем пока появится и исчезнет всплывашка "Операция прошла успешно"
        $x(".//span[contains(@class, 'x-btn-icon-el-default-toolbar-small x-fa fa-refresh')]").click(); // Обновляем страницу
        $x(".//table[.//span[@class='x-grid-checkcolumn']][.//td[.//div[text()='" + value + "']]]").shouldHave(Condition.text("Применён")); // Объект должен быть применен
        exitJd.logout(); // Разлогиниться
        loginPage.loginAgain(); // Авторизоваться повторно без ввода логина
        $x(".//div[text()='Справочники']").click();
        $x(".//div[text()='"+value+"']").doubleClick(); // Двойным кликом открыть созданный объект

    }
}
