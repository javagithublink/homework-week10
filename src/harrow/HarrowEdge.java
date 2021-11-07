package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HarrowEdge {

    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver2 = new EdgeDriver();

        driver2.get(baseUrl);
        driver2.manage().window().maximize();

    }

}
