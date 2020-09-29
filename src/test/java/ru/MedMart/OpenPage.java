package ru.MedMart;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPage extends WebDriverSettings {
    //проверка прогрузки страницы
    @Test
    public void OpenPageHome() throws InterruptedException {
        driver.get("https://medmartonline.com/");
        Thread.sleep(200);
        String home_title = driver.getTitle();
        System.out.println("Page Title :" + home_title);
        Assert.assertTrue(home_title.contains("Stair Lifts | Mobility Scooters | Lift Chairs | Vehicle Lifts | Medical Equipment"));
        driver.quit();
    }

    @Test
    public void OpenPageBrands() throws InterruptedException {
        driver.get("https://medmartonline.com/brands/");
        Thread.sleep(100);
        String brans_title = driver.getTitle();
        System.out.println("Page Title:" + brans_title);
        Assert.assertTrue(brans_title.contains("brands"));
        driver.quit();
    }

    @Test
    public void OpenPage25Top() throws InterruptedException {
        driver.get("https://medmartonline.com/promos-3/");
        Thread.sleep(100);
        String Top_title = driver.getTitle();
        System.out.println("Page Title:" + Top_title);
        Assert.assertTrue(Top_title.contains("Top 25"));
        driver.quit();
    }

    @Test
    public void OpenPagePromotions() throws InterruptedException {
        driver.get("https://medmartonline.com/promotion/");
        Thread.sleep(100);
        String Promotions_title = driver.getTitle();
        System.out.println("Page Title:" + Promotions_title);
        Assert.assertTrue(Promotions_title.contains("Promotion"));
        driver.quit();
    }

    @Test
    public void OpenPageOutlet() throws InterruptedException {
        driver.get("https://medmartonline.com/outlet/");
        Thread.sleep(100);
        String Outlet_title = driver.getTitle();
        System.out.println("Page Title:" + Outlet_title);
        Assert.assertTrue(Outlet_title.contains("Open Box"));
        driver.quit();

    }
    @Test
    public void OpenPagelifetime() throws InterruptedException {
        driver.get("https://medmartonline.com/lifetime-tech-support");
        Thread.sleep(100);
        String lifetime_title = driver.getTitle();
        System.out.println("Page Title:" + lifetime_title);
        Assert.assertTrue(lifetime_title.contains("Lifetime Tech Support"));
        driver.quit();

    }
    @Test
    public void OpenPagePremierInHome() throws InterruptedException {
        driver.get("https://medmartonline.com/premier-in-home-delivery");
        Thread.sleep(100);
        String PremierInHome_title = driver.getTitle();
        System.out.println("Page Title:" + PremierInHome_title);
        Assert.assertTrue(PremierInHome_title.contains("Premier In-Home Delivery"));
        driver.quit();

    }
    @Test
    public void OpenPageInstallation() throws InterruptedException {
        driver.get("https://medmartonline.com/installation-services");
        Thread.sleep(100);
        String Installation_title = driver.getTitle();
        System.out.println("Page Title:" + Installation_title);
        Assert.assertTrue(Installation_title.contains("Installation Services"));
        driver.quit();
}



}

