package com.it.pop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForm extends FillForm{


    @Test
    public void testForm() {
        //Type in First name
        TypeFirstName("Duncan");

        //Type in Last name
        TypeLastName("Jonson");

        //Type in Job title
        TypeJobeTitle("Truck Driver");

        //Choose level of education
        ChooseLevelOfEducation(highSchool);

        //Gender
        ChooseGender(female);

        //Years of experience
        ChooseYearsOfExperience(2);

        //Choose date
        ChooseDate("10/16/2020");

        //Press submit button
        PressSubmitButton();

        //Test that the url is correct
        String url = driver.getCurrentUrl();
        String currentUrl = "https://formy-project.herokuapp.com/thanks";
        assertEquals(url, currentUrl);
        System.out.println("Url is correct");

        //Check that the title is correct
        String title = driver.getTitle();
        String realTitle = "Formy";
        assertEquals(title, realTitle);
        System.out.println("Title is correct");
    }
}
