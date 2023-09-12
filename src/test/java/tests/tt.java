package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tt {
    public static void main(String[] args) {
        String chromeDriver=System.setProperty("chromeDriver","/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();
        homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));

        String homeCheckboxClassName= homeCheckBox.getAttribute("class");
        if (homeCheckboxClassName.equals("rct-icon rct-icon-check")){
            System.out.println(("Checkbox is checked !"));
        }else{
            System.out.println(("Checkbox is unchecked !"));

        }


    }}
