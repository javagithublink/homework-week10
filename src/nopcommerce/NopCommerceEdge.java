package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NopCommerceEdge {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/demo";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver2 = new EdgeDriver();

        driver2.get(baseUrl);
        driver2.manage().window().maximize();
        driver2.close();

    }

}
