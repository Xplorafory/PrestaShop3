package com.it.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollTest {

    static WebDriver driver;
    static JavascriptExecutor js;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @Test
        public void scrollByPixel() {
        driver.get("https://www.fysiken.nu/sv/");

        driver.manage().window().maximize();

        js.executeScript("window.scrollBy(0, 500)");

    }

    @Test
    public void scrollByVisibleElements() {

        driver.get("https://www.fysiken.nu/sv/");

        driver.manage().window().maximize();

        //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.linkText("VISA HELA SCHEMAT"));

        //This will scroll the page to the element
        js.executeScript("arguments[0].scrollIntoView();", Element);

    }

    @Test
    public void scrollByPage() {
        driver.get("https://www.fysiken.nu/sv/");

        driver.manage().window().maximize();

        //This will scroll the web page to the end
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}
