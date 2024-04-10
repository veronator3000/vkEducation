package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement presentsButton = $x("//*[@data-l='t,giftsFront']");
    private final SelenideElement friendsButton = $x("//*[@data-l='t,userFriend']");
    private final SelenideElement messageButton = $x("//*[@data-l='t,messages']");

    public SelenideElement getFriendsButton() {
        return friendsButton.shouldBe();
    }

    public SelenideElement getPresentsButton() {
        return presentsButton.shouldBe();
    }
    public SelenideElement getMessageButton() {
        return messageButton.shouldBe();
    }
    public void pressMessageButton() {
        messageButton.click();
    }
    public void pressFriendsButton() {
        friendsButton.click();
    }
    public void pressPresentsButton() {
        presentsButton.click();
    }
}
