package com.qase.qa.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public void enterLogin(String login) {
        $(UIMap.login).click();
        $(UIMap.login).clear();
        $(UIMap.login).sendKeys(login);
    }

    public void enterPassword(String password) {
        $(UIMap.password).click();
        $(UIMap.password).clear();
        $(UIMap.password).sendKeys(password);
    }
    public Dashboard clickLoginBtn() {
        $(UIMap.button).click();
        return page(Dashboard.class);
    }
}
