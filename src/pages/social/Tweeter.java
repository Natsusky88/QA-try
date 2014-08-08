package pages.social;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Masha on 08.08.2014.
 */
public class Tweeter {


    String loginFieldString = ".//*[@id='signin-email']";


    String passwordFieldSrting = ".//*[@id='signin-password']";


    WebDriver driver;
    private String submitButton = ".//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button";

    public Tweeter(WebDriver driver) {

        this.driver = driver;
    }

    public void logIn(String login, String password) {

        WebElement loginField = driver.findElement(By.xpath(loginFieldString));
        loginField.sendKeys(login);

        WebElement passFiled = driver.findElement(By.xpath(passwordFieldSrting));
        passFiled.sendKeys(password);

        WebElement submitkey =
                driver.findElement(By.xpath(submitButton));

        submitkey.click();


    }


    public void createNewTweet(String textMessage) {

        WebElement newTweet = driver.findElement(By.xpath(".//*[@id='global-new-tweet-button']"));
        newTweet.click();
        WebElement textField = driver.findElement(By.xpath(".//*[@id='tweet-box-global']"));


        textField.sendKeys(textMessage);
        WebElement tweetButton =
                driver.findElement(By.xpath(".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[2]/div[2]/button"));

        tweetButton.click();

    }

}
