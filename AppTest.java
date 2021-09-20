package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import java.time.Instant;

public class AppTest{
    WebDriver driver;

    @Test
    public void TC01_SearchQuery() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".//src//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://thesparksfoundationsingapore.org/");
        driver.manage().window().maximize();

        boolean logoPresent = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img")).isDisplayed();
        Assert.assertTrue(logoPresent);

        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("The Sparks Foundation | Home");
        assertTrue(verifyTitle);




        WebElement aboutMenu = driver.findElement(By.xpath ("//*[@id=\"link-effect-3\"]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutMenu);
        actions.click().build().perform();


        WebElement subMenu = driver.findElement(By.xpath ("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[2]/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();


        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a"));
        actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        actions.click().build().perform();

        subMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[4]/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();


        subMenu = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[1]/div/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        Set<String> handlesSet = driver.getWindowHandles();

        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.switchTo().window(handlesList.get(0));

        WebElement joinMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/a"));
        actions = new Actions(driver);
        actions.moveToElement(joinMenu);
        actions.click().build().perform();

        subMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/ul/li[1]/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        driver.findElement(By.name("Name")).sendKeys("Abdul Hadi");
        driver.findElement(By.name("Email")).sendKeys("syed.hadi@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select")).sendKeys("Student");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[3]")).click();
        Thread.sleep(5000);

        WebElement contactMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a"));
        actions = new Actions(driver);
        actions.moveToElement(contactMenu);
        actions.click().build().perform();


        subMenu = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]/div[1]/ul/li[1]/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        handlesSet = driver.getWindowHandles();

        handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.switchTo().window(handlesList.get(0));
        Thread.sleep(2000);


        contactMenu = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a"));
        actions = new Actions(driver);
        actions.moveToElement(contactMenu);
        actions.click().build().perform();

        subMenu = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[4]/ul/li[1]/a"));
        actions = new Actions(driver);
        actions.moveToElement(subMenu);
        actions.click().build().perform();
}}
