package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by polkota on 04.08.2015.
 */
public class Webdriver1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver cDriver = new ChromeDriver();
        cDriver.get("http://google.com");
        Thread.sleep(5000);
        cDriver.quit();
    }
}

