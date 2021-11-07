package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XcartMultiBrowser {
    static String baseUrl = "https://www.x-cart.com/";
    static String browser = "Edge";
    static WebDriver driver4;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver4 = new ChromeDriver();
            driver4.get(baseUrl);
            driver4.manage().window().maximize();
            System.out.println(driver4.getTitle());
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver4 = new FirefoxDriver();
            driver4.get(baseUrl);
            driver4.manage().window().maximize();
            System.out.println(driver4.getTitle());
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver4 = new EdgeDriver();
            driver4.get(baseUrl);
            driver4.manage().window().maximize();
            System.out.println(driver4.getTitle());
        }else{
            System.out.println("Check browser name");
        }


    }

}
