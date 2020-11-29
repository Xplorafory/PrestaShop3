package com.it.selenium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTests {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
    }

    @Test
    public void hideColumn() {

        driver.manage().window().maximize();
        driver.get("https://jwatsondev.github.io/ng-prime-testing/");

        driver.findElement(By.xpath("/html/body/app-root/app-prime/div/p-table/div/div[1]/div/p-multiselect/div/div[2]/label")).click();

        driver.findElement(By.xpath("/html/body/app-root/app-prime/div/p-table/div/div[1]/div/p-multiselect/div/div[4]/div[2]/ul/li[2]/div/div[2]/span")).click();

    }

    @Test
    public void showColumn() {

        //Variable for checking the result
        boolean result = false;

        driver.manage().window().maximize();
        driver.get("https://jwatsondev.github.io/ng-prime-testing/");

        //Select the ID column then clicking ID Column button to hide column then clicking it again to show the column
        driver.findElement(By.xpath("/html/body/app-root/app-prime/div/p-table/div/div[1]/div/p-multiselect/div/div[3]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-prime/div/p-table/div/div[1]/div/p-multiselect/div/div[4]/div[2]/ul/li[2]/label")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-prime/div/p-table/div/div[1]/div/p-multiselect/div/div[4]/div[2]/ul/li[2]/label")).click();


        try
        {
            result = driver.findElement(By.id("id")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println("Execption was thrown as expected since column was not visible");
        }

    }


}
