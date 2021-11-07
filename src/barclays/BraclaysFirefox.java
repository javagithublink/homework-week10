package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BraclaysFirefox {

    public static void main(String[] args) {

        String baseUrl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver1 = new FirefoxDriver();

        driver1.get(baseUrl);
        driver1.manage().window().maximize();

    }

}
