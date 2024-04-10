package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class FriendsPage {
    public final SelenideElement onLine = $x("//*[@class='mctc_navMenuSec ellip-menu-item ']");

    public SelenideElement getOnLine() {
        return onLine.shouldBe();
    }
}
