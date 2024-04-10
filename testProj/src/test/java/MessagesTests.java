import baseValues.BaseValues;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.MessagesPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@DisplayName("Messages tests (◕‿◕)♡")
public class MessagesTests {
    private static MainPage mainPage;
    private static LoginPage loginPage;
    private static MessagesPage messages;
    public static WebDriverWait wait;
    @BeforeAll
    public static void init() {
        System.setProperty(BaseValues.Base.getBaseDriver(), BaseValues.Base.getBaseDriverObj());
        open(BaseValues.Base.getBaseUrl());
        loginPage = new LoginPage();
        messages = new MessagesPage();
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        loginPage.enter();
        mainPage = new MainPage();
        wait = new WebDriverWait(getWebDriver(), 10);
        mainPage.pressMessageButton();
    }

    @Test
    @DisplayName("Recipient search button OK! ʕᵔᴥᵔʔ")
    @Tag("Messages")
    public void testRecipientButtonIsDisplayedCorrectly() {
        wait.until(ExpectedConditions.visibilityOf(messages.getSearch()));
        Assertions.assertTrue(messages.getSearch().isDisplayed());
    }
    @AfterEach
    public void closeDriver() {
        closeWebDriver();
    }
}
