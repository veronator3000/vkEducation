import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class PresentsTests {
    private final String login = "technopol43";
    private final String password = "technopolisPassword";
    private MainPage mainPage;
    private LoginPage loginPage;

    private final String baseUrl = "https://ok.ru/";

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/home/veronika/chromedriver-linux64/chromedriver");
        open(baseUrl);
        loginPage = new LoginPage();
        loginPage.login(login, password);
        loginPage.enter();
        mainPage = new MainPage();
    }

    @Test
    public void testLoginPageElementsPresence() {
        mainPage.getPresentsButton().shouldBe();
    }
    @AfterAll
    public static void closeBrowser()
    {
        closeWebDriver();
    }
}
