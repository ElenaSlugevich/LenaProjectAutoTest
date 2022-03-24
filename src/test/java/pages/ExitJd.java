package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExitJd {
    public SelenideElement unloginButton = $x(".//span[contains(@class, 'fa-sign-out')]");

    public void logout() {
        unloginButton.click();
    }
}
