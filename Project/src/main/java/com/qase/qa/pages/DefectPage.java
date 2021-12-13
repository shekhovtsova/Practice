package com.qase.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DefectPage {
    @FindBy(xpath = "//div[1]/h1[.='Defects']")
    public SelenideElement defectPage;

    @FindBy(linkText = "Create new defect")
    public SelenideElement createNewDefectBtn;

    @FindBy(xpath = "/html//div[@id='react-app']/div[@class='app']/div//table//div[@class='dropdown-menu dropdown-menu-end show']/div[5]/a[@href='#']")
    public SelenideElement deleteBtn;

    @FindBy(xpath = "//div[@id='app']/div[@class='ReactModalPortal']/div/div[@role='dialog']//button[@class='btn btn-danger']")
    public SelenideElement confirmDelete;



    public void checkDefectPage() {
        defectPage.shouldBe(Condition.visible);
    }

    public NewDefect createDefect() {
        createNewDefectBtn.click();
        return page(NewDefect.class);
    }

    public void deleteDefect(String name) {
        Selenide.$(By.xpath("//td//div[.='"+name+"']/../following::td/following::td/following::td/following::td/following::td/following::td/div/a")).click();
        deleteBtn.click();
        confirmDelete.click();


    }
}
