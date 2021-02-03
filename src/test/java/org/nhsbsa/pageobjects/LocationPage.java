package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {

    private WebDriver driver = null;

    @FindBy(id = "label-wales")
    private WebElement locationWales;

    @FindBy(id = "label-england")
    private WebElement locationEngland;

    @FindBy(id = "next-button")
    private WebElement btnStart;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseLocation(String loc) throws Throwable{

        switch (loc){
            case ("england"):
                locationEngland.click();
                break;
            default:
                locationWales.click();
                break;
        }

        btnStart.click();
    }
}
