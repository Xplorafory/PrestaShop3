package com.it.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

public class secondTest {


    @BeforeAll
    public static void setup() {

    }


    @Test
    @Order(1)
    @DisplayName("Verifies the page title")
    public void verifyTitle() {

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        //assertEquals("Formy", driver.getTitle(), "Title check failed!");
        String title = driver.getTitle();
        assertTrue(title.contains("Formy"));


        WebElement formElement = driver.findElement(By.id("first-name"));
        formElement.sendKeys("Alan");
        assertEquals("Alan", formElement.getText());


        WebElement formElement2 = driver.findElement(By.id("last-name"));
        formElement2.sendKeys("Smithe");

        WebElement formElement3 = driver.findElement(By.id("job-title"));
        formElement3.sendKeys("Truck driver");

        driver.close();
        driver.quit();
    }

    @Test
    @Order(2)
    public void verifyTitle2() {

    }
}
