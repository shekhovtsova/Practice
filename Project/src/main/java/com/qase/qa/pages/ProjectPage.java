package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ProjectPage {

    @FindBy(xpath = "/html//div[@id='app']//div[@class='app-content']/div[@class='container-submenu d-flex']//div[@class='sub-menu-container']/div[1]/div/div[2]/p[@class='header']")
    public SelenideElement projectPageHeader;

    @FindBy(xpath = "//a[@id='menu-link-test-defects']/span[@class='submenu-item-text']")
    public SelenideElement linkDefect;

    public void checkProjectPage() {
        projectPageHeader.shouldBe(Condition.visible);
    }

    public DefectPage openDefectPage() {
        linkDefect.click();
        return page(DefectPage.class);
    }
}
