package com.testng;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Testngdemo {
WebDriver driver;


@BeforeMethod
@Parameters({"browser","url"})
    public void launch(@Optional("edge") String browser, String url){
if(browser.equals("chrome")){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();}
 else if (browser.equals("edge")) {

    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();

}
    driver.get(url);
    driver.manage().window().maximize();    }

@Test
    public void test1(){
    driver.findElement(By.name("q")).sendKeys("javatutorial" + Keys.ENTER);
}

@AfterMethod

public void close(){
    driver.close();
}
}
