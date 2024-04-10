package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class PresentsPage {
    private final static SelenideElement myGiftsButton = $x("//button[@class='mctc_navMenuDropdownSecLabelText mctc_navMenuDropdownButton']");
    public SelenideElement getMyGiftsButton() {
        return myGiftsButton.shouldBe();
    }
}
