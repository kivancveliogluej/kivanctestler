package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args) {
        String chromeDriver = System.setProperty("chromeDriver", "/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println(isEnabled);
        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        try {
            sportCheckbox.click();
        }catch (org.openqa.selenium.ElementClickInterceptedException e) {
            sportCheckboxLabel.click();
        sportCheckboxLabel.click();
        System.out.println("Entered catch block");
    }

    boolean isSelected = sportCheckbox.isSelected();
    System.out.println(isSelected);
}
}