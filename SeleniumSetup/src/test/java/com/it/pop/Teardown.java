package com.it.pop;


import org.junit.jupiter.api.AfterAll;

public class Teardown extends TestForm {
    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
