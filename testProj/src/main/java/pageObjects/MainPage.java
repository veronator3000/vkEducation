package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement presentsButton = $x("//<a[@data-l='t,giftsFront']");
    private final SelenideElement friendsButton = $x("//<a[@data-l='t,userFriend']");

    public SelenideElement getFriendsButton() {
        return friendsButton;
    }

    public SelenideElement getPresentsButton() {
        return presentsButton;
    }
}
