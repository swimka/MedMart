package ru.MedMart;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestCheckout extends WebDriverSettings {
    @Test
    public void TestCheckout() throws InterruptedException {
        driver.get("https://medmartonline.com");
        driver.findElementByLinkText("All Categories").click();
        Thread.sleep(1500);
        driver.get("https://medmartonline.com/mobility-scooters/portable-scooters/golden-technologies-literider-4-wheel-travel-scooter");
        Thread.sleep(3000);
        driver.findElementByCssSelector(".product-options-wrapper > div > div > div > details").click();
        driver.findElementById("option-label-color-272-item-25").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"product_addtocart_form\"]/div[2]/details/summary/strong").click();
        driver.findElementById("deliverysetup-29291").click();
        driver.findElementById("product-addtocart-button").click();
        System.out.println("Товар добавлен в корзину");
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@id=\"confirmButtons\"]/a").click();
        Thread.sleep(5000);
        String  checkout_title = driver.getTitle();
        System.out.println("Page Title:" + checkout_title);
        Assert.assertTrue(checkout_title.contains("Checkout"));
        System.out.println("Открыт чекаут");
        driver.findElementById("customer-email").sendKeys("test@net.com");
        Thread.sleep(5000);
        driver.findElementById("customer-password").sendKeys("AAAqqq111!");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button").click();
        Thread.sleep(13000);
        System.out.println("Авторизован под кастомером");
        driver.findElementByXPath("//*[@id=\"Q8LGDX7\"]").sendKeys("CompanyTest"+n);
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"WD5BVTU\"]").sendKeys("adressTest"+n);
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"G2RYI36\"]").sendKeys("TestApt"+n);
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"HS4U5O8\"]").sendKeys("CityTest"+n);
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"FEFN5K8\"]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"FEFN5K8\"]/option[2]").click();
        driver.findElementByXPath("//*[@id=\"THH0YIX\"]").sendKeys("+79099999999");










    }
}
