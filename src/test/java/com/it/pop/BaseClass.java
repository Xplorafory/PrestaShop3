package com.it.pop;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    static WebDriver driver;
    public static String highSchool = "#radio-button-1";
    public static String college = "#radio-button-2";
    public static String gradSchool = "#radio-button-3";
    public static String male = "#checkbox-1";
    public static String female = "#checkbox-2";
    public static String preferNotToSay = "#checkbox-3";


    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
    }


}
