package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement usernameField = $x("//input[@name='st.email']");
    private final SelenideElement passwordField = $x("//input[@name='st.password']");
    private final SelenideElement loginButton = $x("//input[@value='Log in to OK']");

    public void login(String login, String password) {
        usernameField.setValue(login);
        passwordField.setValue(password);
    }

    public SelenideElement getUsernameField() {
        return usernameField.shouldBe();
    }

    public SelenideElement getPasswordField() {
        return passwordField.shouldBe();
    }
    public void enter()
    {
        loginButton.click();
    }
}
