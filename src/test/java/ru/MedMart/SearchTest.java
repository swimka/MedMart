package ru.MedMart;

import org.junit.Test;
import org.openqa.selenium.Keys;

public class SearchTest extends WebDriverSettings {
    @Test
    public void SearchTest() throws InterruptedException {
        driver.get("https://medmartonline.com");
        Thread.sleep(2000);
        driver.findElementById("search").click();
        driver.findElementById("search").sendKeys("Travel Pro 3-Wheel");
        driver.findElementById("search").sendKeys(Keys.ENTER);
        driver.quit();
    }
}
