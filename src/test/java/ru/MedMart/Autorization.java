package ru.MedMart;

import org.junit.Test;

public class Autorization extends WebDriverSettings {
    @Test
    public void Autorization() throws InterruptedException {
        driver.get("https://medmartonline.com");
        Thread.sleep(2000);
        driver.findElementByCssSelector("div.customer-welcome.account > span.customer-name > button.action.switch").click();
        driver.findElementByLinkText("Sign In").click();
        driver.findElementById("email").sendKeys("test@net.com");
        Thread.sleep(1000);
        driver.findElementById("pass").sendKeys("AAAqqq111!");
        driver.findElementById("send2").click();
        driver.quit();




    }
}
