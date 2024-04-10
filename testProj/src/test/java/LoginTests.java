import baseValues.BaseValues;
import org.junit.jupiter.api.*;
import pageObjects.LoginPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@DisplayName("Login tests (⊃｡•́‿•̀｡)⊃━✿✿✿✿✿✿")
public class LoginTests {
    ;
    private final static String fakePassword = "239qwerty239";
    private final static String fakeEmail = "@NO_EMAIL@BK.RU";
    private static LoginPage loginPage;

    @BeforeEach
    public void init() {
        System.setProperty(BaseValues.Base.getBaseDriver(), BaseValues.Base.getBaseDriverObj());
        open(BaseValues.Base.getBaseUrl());
        loginPage = new LoginPage();
    }

    @Test
    @DisplayName("Login elements exist! (づ ◕‿◕ )づ")
    @Tag("logIn")
    public void testLoginPageElementsPresence() {
        Assertions.assertTrue(loginPage.getPasswordField().isDisplayed());
        Assertions.assertTrue(loginPage.getUsernameField().isDisplayed());
        ;
    }

    @Test
    @DisplayName("Login success test! (⊙_⊙)")
    @Tag("logIn")
    public void testLogin() {
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        loginPage.enter();
        Assertions.assertFalse(loginPage.getPasswordField().isDisplayed());
    }

    @Test
    @DisplayName("Login failed test! (-_-;)・・・")
    @Tag("logIn")
    public void testLoginFailed() {
        var newLogin = new LoginPage();
        newLogin.login(fakePassword, fakeEmail);
        Assertions.assertTrue(loginPage.getPasswordField().isDisplayed());
    }


    @Test
    @DisplayName("Login fields filling success! ╯°□°)╯")
    @Tag("logIn")
    public void testLoginFieldsFilled() {
        loginPage.login(BaseValues.Base.getBaseLogin(), BaseValues.Base.getBasePassword());
        Assertions.assertEquals(BaseValues.Base.getBaseLogin(), loginPage.getUsernameField().getValue());
    }

    @AfterEach
    public void closeDriver() {
        closeWebDriver();
    }
}
