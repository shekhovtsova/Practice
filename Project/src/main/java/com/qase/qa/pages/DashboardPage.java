package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DashboardPage {
    @FindBy(id = "user-menu")
    public SelenideElement submit;

    @FindBy(xpath = "//div[@id='app']/div/div/div/div/ul/li[3]/a/span")
    public SelenideElement linkWorkSpace;

    @FindBy (xpath = "/html//div[@id='react-app']/div[@class='app']/div[@class='container-fluid']//table//tr[@class='project-row']/td[3]/div[1]/a[@href='/project/DEMO']")
    public SelenideElement openProject;


    public void checkDashboardPage() {

        submit.shouldBe(Condition.visible);
    }

    public WorkSpacePage openWorkSpacePage() {
        linkWorkSpace.click();
        return page(WorkSpacePage.class);
    }

    public ProjectPage openProjectPage() {
        openProject.click();
        return page(ProjectPage.class);
    }

}