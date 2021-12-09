package com.qase.qa.pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v85.browser.Browser.close;


public class FirstTest {

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            Configuration.browser="chrome";
            Configuration.browserSize = "800x600";
        }

        @Test
        public void loginAsRegistrationUser() throws Exception {

            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.checkDashboardPage();
            dashboardPage.exit();
        }

        @Test
        public void openWS() throws Exception {
            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.checkDashboardPage();
            WorkSpacePage workSpacePage = dashboardPage.openWorkSpacePage();
            workSpacePage.checkWorkspacePage();
        }

        @AfterMethod(alwaysRun = true)
        public void tearDown() throws Exception {
            close();
        }



}
