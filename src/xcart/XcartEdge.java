package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XcartEdge {

    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver2 = new EdgeDriver();

        driver2.get(baseUrl);
        driver2.manage().window().maximize();
        System.out.println(driver2.getTitle());

       }
}
