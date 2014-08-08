import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Main {


    public static void main(String[] args) throws Exception {

        DesiredCapabilities capability = DesiredCapabilities.firefox();

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        // Go to the Google Suggest home page
        driver.get("http://www.google.com/webhp?complete=1&hl=en");

        driver.quit();
    }
}