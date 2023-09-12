package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class ejtest {
    public static void main(String[] args) {
        ChromeOptions options;
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.emlakjet.com/");
        driver.manage().window().maximize();
        WebElement jetsatBasvuru = driver.findElement(By.xpath("//div[contains(text(),'Teklif al')]"));
        jetsatBasvuru.click();



        /*WebElement jetsatDropdownAcma= driver.findElement(By.xpath("/html//div[@id='__next']/div[3]/div[@class='ZmBAmv']/div[@class='_2DETB2']/div/div[4]/div[2]/div/div/div[@class='ej91']/div[@role='button']"));
        Actions action=new Actions(driver);
        action.doubleClick(jetsatDropdownAcma).perform();

        WebElement jetsatİlceSecimi = driver.findElement(By.xpath("ul > li:nth-of-type(13)"));
        jetsatİlceSecimi.click();*/



    }
}








