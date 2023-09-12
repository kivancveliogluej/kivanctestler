package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
    public static void main(String[] args) {
        String chromeDriver = System.setProperty("chromeDriver", "/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesRadioButton = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButton.isEnabled();
        if (isEnabled) {
            yesRadioButton.click();
            System.out.println("Clicked yesRadio button");
            WebElement output= driver.findElement(new By.ByCssSelector("p.mt-3"));
            System.out.println(output.getText());

            WebElement noRadioButton = driver.findElement(new By.ByCssSelector("label[for='noRadio']"));
            System.out.println(noRadioButton.isEnabled());

        }
    }
}