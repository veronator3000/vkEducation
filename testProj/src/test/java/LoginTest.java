import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObjects.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    private final String baseUrl = "https://ok.ru/";
    private final String login = "technopol43";
        private final String password = "technopolisPassword";

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/home/veronika/chromedriver-linux64/chromedriver");
        open(baseUrl);
    }

    @Test
    public void testLoginPageElementsPresence() {
        LoginPage loginPage = new LoginPage();
        loginPage.getUsernameField().shouldBe();
        loginPage.getPasswordField().shouldBe();
    }
    @AfterAll
    public static void closeBrowser()
    {
        closeWebDriver();
    }
}
