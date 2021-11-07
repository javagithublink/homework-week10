package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HarrowMultiBrowser {
    static String baseUrl = "https://www.harrow.gov.uk/";
    static String browser = "firefox";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
        } else if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();

        } else if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
        } else{
            System.out.println("Check browser name");
        }

    }

}
