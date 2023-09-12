package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test5 {

    public static void main(String[] args) {
        String chromeDriver = System.setProperty("chromeDriver", "/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));

        Actions action=new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement messaga=driver.findElement(By.id("doubleClickMessage"));
        String messageText= messaga.getText();
        System.out.println(messageText);

        WebElement rightClickButton= driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage=driver.findElement(By.id("rightClickMessage"));
        String message2 = rightClickMessage.getText();
        System.out.println(message2);

    }}


