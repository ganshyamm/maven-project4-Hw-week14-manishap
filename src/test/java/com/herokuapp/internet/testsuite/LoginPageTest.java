package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.sendTextToElement(By.id("username"), "tomsmith");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedM = "Secure Area";
        String actualText = loginPage.verifyMessage();
        Assert.assertEquals(actualText, expectedM, "Secure Area");
    }

    @Test
    public void verifyTheUserNameErrorMessage() {
        loginPage.sendTextToElement(By.id("username"), "tomdmith1");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedM = "Your username is invalid!";
        String actualmessage = loginPage.verifyErrorMessage();
        Assert.assertEquals(actualmessage, expectedM, "Your username is invalid!");


    }
    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.sendTextToElement(By.id("username"), "tomsmith");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String actualM = "Your password is invalid!";
        Assert.assertEquals(actualM,"Your password is invalid!","verify Error Message");



    }


}
