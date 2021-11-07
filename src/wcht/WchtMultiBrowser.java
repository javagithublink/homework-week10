package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WchtMultiBrowser {

    static String baseUrl = "https://www.wcht.org.uk/";
    static String browser = "chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("Firefox")) {

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

            new FirefoxDriver().get(baseUrl);
            driver.manage().window().maximize();

        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            new EdgeDriver().get(baseUrl);
            driver.manage().window().maximize();
        } else {
            System.out.println("Wrong browser name");
        }


    }


}
