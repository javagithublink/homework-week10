package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XcartFirefox {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();

        driver1.get(baseUrl);
        driver1.manage().window().maximize();
        System.out.println(driver1.getTitle());

    }

}
