package com.it.selenium;

import com.it.pop.FillForm;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import static org.junit.jupiter.api.Assertions.*;
/*
public class TestElements extends FillForm {


    @Test
    public void TestElements() {

        //Type in First name
        TypeFirstName("Duncan");

        //Type in Last name
        TypeLastName("Jonson");

        //Type in Job title
        TypeJobeTitle("Truck Driver");


        //Choose Highest level of education
        driver.findElement(By.cssSelector("#radio-button-1")).click();



        //Choose gender
        driver.findElement(By.cssSelector("#checkbox-1")).click();

        //Choose Years of experience
        //driver.findElement(By.className("form-control")).click();
        Select selectMenu = new Select(driver.findElement(By.id("select-menu")));
        //selectMenu.selectByVisibleText("0-1");
        selectMenu.selectByIndex(2);

        //Choose date
        driver.findElement(By.id("datepicker")).sendKeys("10/15/2020");

        //Press submit button
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

        //Test that the url is correct
        String title = driver.getTitle();
        String successMessage = "Formy";
        assertEquals(title,successMessage);

        //Test that the url is correct
        String url = driver.getCurrentUrl();
        String currentUrl = "https://formy-project.herokuapp.com/thanks";
        assertEquals(url, currentUrl);
    }

}

*/