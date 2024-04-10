import baseValues.BaseValues;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import pageObjects.MainPage;


import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@DisplayName("Main page tests ／(･ × ･)＼")
public class MainPageTests {
    private MainPage mainPage;
    private LoginPage loginPage;
    public static WebDriverWait wait;

    @BeforeEach
    public void init() {
        System.setProperty(BaseValues.Base.getBaseDriver(), BaseValues.Base.getBaseDriverObj());
        open(BaseValues.Base.getBaseUrl());
        loginPage = new LoginPage();
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        loginPage.enter();
        mainPage = new MainPage();
        wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 5);
    }

    @TestFactory
    @DisplayName("Button exist tests \t¯\\_(ツ)_/¯")
    Stream<DynamicTest> buttonExistTests() {
        return Stream.of(
                dynamicTest("Presents button exist", () -> {
                    Assertions.assertTrue(mainPage.getPresentsButton().isDisplayed());
                }),
                dynamicTest("Messages button exist", () -> {
                    Assertions.assertTrue(mainPage.getMessageButton().isDisplayed());
                }),
                dynamicTest("Friends button exist", () -> {
                    Assertions.assertTrue(mainPage.getFriendsButton().isDisplayed());
                })
        );
    }

    @AfterEach
    public void closeDriver() {
        closeWebDriver();
    }
}
