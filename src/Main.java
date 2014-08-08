import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.social.Tweeter;

import java.net.URL;

public class Main {


    public static void main(String[] args) throws Exception {

        DesiredCapabilities capability = DesiredCapabilities.firefox();

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        // Go to the Google Suggest home page
        driver.get("https://twitter.com/");

        Tweeter tweeter = new Tweeter(driver);

        tweeter.logIn("Sunny_Sky_", "sakamotochika");
        String tweet = " Hochetsa vodki... da bro za rulyom(";
        tweeter.createNewTweet(tweet);



        driver.quit();
    }
}