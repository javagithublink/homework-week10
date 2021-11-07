package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HarrowFirefox {

    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver1 = new FirefoxDriver();
        driver1.get(baseUrl);
        driver1.manage().window().maximize();
    }
}
