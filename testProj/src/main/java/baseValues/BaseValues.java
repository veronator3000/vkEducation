package baseValues;

public class BaseValues {
    public static class Base {
        private final static String baseUrl = "https://ok.ru/";
        private final static String baseDriverObj = "/home/veronika/chromedriver-linux64/chromedriver";
        private final static String baseDriver = "webdriver.chrome.driver";
        private final static String baseLogin = "technopol43";
        private final static String basePassword = "technopolisPassword";
        public static String getBaseUrl() {
            return baseUrl;
        }
        public static String getBaseDriverObj() {
            return baseDriverObj;
        }
        public static String getBaseDriver() {
            return baseDriver;
        }
        public static String getBaseLogin() {
            return baseLogin;
        }
        public static String getBasePassword() {
            return basePassword;
        }
    }

}
