package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {

        String chromeDriver = System.setProperty("chromeDriver","/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Kıvanç Velioğlu");

        WebElement email= driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("ali.kivanc.velioglu@gmail.com");

        WebElement currentAddress=driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Ataşehir", "/", "İstanbul");


        WebElement permanentAddress =driver.findElement(new By.ById("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Örnek Mahallesi","/","Temizel Sokak");

        WebElement submitButton=driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();


        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
                String name=nameText.getText();
        System.out.println(name);


    }

}

