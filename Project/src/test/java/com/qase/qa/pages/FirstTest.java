package com.qase.qa.pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            Configuration.browser="chrome";
            Configuration.browserSize = "800x600";
            Configuration.timeout = 60000;
        }

       /*@Test
        public void loginAsRegistrationUser() throws Exception {

            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.checkDashboardPage();
        }*/

        /*@Test
        public void openWorkspace() throws Exception {
            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.checkDashboardPage();
            WorkSpacePage workSpacePage = dashboardPage.openWorkSpacePage();
            workSpacePage.checkWorkspacePage();
        }*/

        @Test
        public void createNewDefect() {
            open("https://app.qase.io/login");
            LoginPage loginPage =  open("https://app.qase.io/login", LoginPage.class);
            loginPage.enterLogin("voddoleyka@gmail.com");
            loginPage.enterPassword("7@mQVN!D8xsxd*m");
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.checkDashboardPage();
            ProjectPage projectPage = dashboardPage.openProjectPage();
            projectPage.checkProjectPage();
            DefectPage defectPage = projectPage.openDefectPage();
            defectPage.checkDefectPage();
            NewDefect newDefect = defectPage.createDefect();
            newDefect.checkNewDefect();
            newDefect.setPriority();

        }

        @AfterMethod
        public void tearDown() throws Exception {
            closeWindow();
        }

}
