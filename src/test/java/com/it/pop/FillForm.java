package com.it.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class FillForm extends BaseClass {


    public void TypeFirstName(String firstName) {
        //Type in First name
        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    public void TypeLastName(String lastName) {

        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    public void TypeJobeTitle(String jobTitle) {
        driver.findElement(By.id("job-title")).sendKeys(jobTitle);
    }

    //Choose gender
    public void ChooseGender(String buttons) {
        driver.findElement(By.cssSelector(buttons)).click();
    }

    //Choose years of experience
    public void ChooseYearsOfExperience(Integer index) {
        Select selectMenu = new Select(driver.findElement(By.id("select-menu")));
        selectMenu.selectByIndex(index);
    }

    //Choose level of education
    public void ChooseLevelOfEducation(String option) {
        driver.findElement(By.cssSelector(option)).click();
    }

    //Choose date
    public void ChooseDate(String date) {
        driver.findElement(By.id("datepicker")).sendKeys(date);
    }

    //Press submit button
    public void PressSubmitButton() {
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
}
