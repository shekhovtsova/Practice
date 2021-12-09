package com.qase.qa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(id = "inputEmail")
    public SelenideElement login;
    @FindBy(id = "inputPassword")
    public SelenideElement password;
    @FindBy(id = "btnLogin")
    public SelenideElement btn;



    public void enterLogin(String name) {
        login.click();
        login.clear();
        login.sendKeys(name);
    }

    public void enterPassword(String pass) {
        password.click();
        password.clear();
        password.sendKeys(pass);
    }
    public DashboardPage clickLoginBtn() {
        btn.click();
        return page(DashboardPage.class);
    }
}
