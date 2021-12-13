package com.qase.qa.pages.util;

public class LoginData {
    private String login;
    private String password;

    public LoginData(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
