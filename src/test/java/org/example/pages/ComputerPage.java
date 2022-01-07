package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ComputerPage extends DriverManager {
    @FindBy(xpath = "//[@class='header-menu']/ul[1]/li[1]")
    private WebElement computerBtn;

    @FindBy(xpath = "//[@class='sub-category-item']/h2[1]/a[1]")
    private WebElement desktopBtn;






}
