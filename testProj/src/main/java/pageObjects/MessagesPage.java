package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MessagesPage {
    private final SelenideElement search = $x("//input[@class='base-input-okmsg']");

    public SelenideElement getSearch() {
        return search.shouldBe();
    }
}
