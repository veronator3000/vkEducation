import baseValues.BaseValues;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FriendsPage;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@DisplayName("Friends tests (^=◕ᴥ◕=^)")
public class FriendsTests {

    private static MainPage mainPage;
    private static LoginPage loginPage;
    private static FriendsPage friendsPage;
    public static WebDriverWait wait;

    @BeforeAll
    public static void init() {
        System.setProperty(BaseValues.Base.getBaseDriver(), BaseValues.Base.getBaseDriverObj());
        open(BaseValues.Base.getBaseUrl());
        loginPage = new LoginPage();
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        loginPage.enter();
        mainPage = new MainPage();
        friendsPage = new FriendsPage();
        wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 5);
    }

    @Test
    @DisplayName("Friends OnLine button OK! (.❛ᴗ❛.)")
    @Tag("Friends")
    public void testFriendsOnLineButtonClick() {
        mainPage.getFriendsButton().click();
        wait.until(ExpectedConditions.visibilityOf(friendsPage.getOnLine()));
        Assertions.assertTrue(friendsPage.getOnLine().isDisplayed());
    }
    @AfterAll
    public static void closeDriver()
    {
        closeWebDriver();
    }
}
