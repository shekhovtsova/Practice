package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class WorkSpacePage {
    @FindBy(xpath = "//div[@id='app']/div/div/div/div/ul/li[3]/a/span")
    public SelenideElement invites;

    public void checkWorkspacePage() {
        invites.shouldBe(Condition.visible);

    }
}
