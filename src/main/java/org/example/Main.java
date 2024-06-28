package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class Main {
    public static void main(String[] args)throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
edgeOptions.getCapabilityNames();
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://expired.badssl.com/");
        System.out.println("title of the page: " +driver.getTitle());
driver.close();
    }
}