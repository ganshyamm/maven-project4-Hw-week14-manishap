package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.UtilityClass;
import org.openqa.selenium.By;

public class LoginPage extends UtilityClass {

    By username = By.id("username");

    By password = By.id("password");

    By LoginButton = By.xpath("//button[@type='submit']");

    By verifyText = By.xpath("//*[@id=\"content\"]/div/h2");

    By errorMessage = By.xpath("//div[contains(text(),'Your username is invalid!')]");
    By errorMessage1 = By.xpath("/div[contains(text(),'Your password is invalid!')]");


    public void userName(String username1) {
        sendTextToElement(username, username1);
    }

    public void Password(String password1) {
        sendTextToElement(password, password1);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);


    }

    public String verifyMessage() {
        return getTextFromElement(verifyText);
    }

    public String verifyErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public String verifyErrorMessage1() {
        return getTextFromElement(errorMessage1);
    }
}