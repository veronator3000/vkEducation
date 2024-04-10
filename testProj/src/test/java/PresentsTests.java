import baseValues.BaseValues;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.PresentsPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@DisplayName("Presents tests (^=◕ᴥ◕=^)")
public class PresentsTests {
    private MainPage mainPage;
    private LoginPage loginPage;
    private PresentsPage presentsPage;
    public static WebDriverWait wait;

    @BeforeEach
    public void init() {
        System.setProperty(BaseValues.Base.getBaseDriver(), BaseValues.Base.getBaseDriverObj());
        open(BaseValues.Base.getBaseUrl());
        loginPage = new LoginPage();
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        loginPage.enter();
        mainPage = new MainPage();
        presentsPage = new PresentsPage();
        wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 5);
    }

    @Test
    @DisplayName("MyPresents button OK! (^_−)☆")
    @Tag("Presents")
    public void testPresentsPageMyGiftsButtonCorrectlyState()
    {
        mainPage.getPresentsButton().click();
        wait.until(ExpectedConditions.visibilityOf(presentsPage.getMyGiftsButton()));
        Assertions.assertTrue(presentsPage.getMyGiftsButton().isDisplayed());
    }

    @AfterEach
    public void closeDriver()
    {
        closeWebDriver();
    }
}
