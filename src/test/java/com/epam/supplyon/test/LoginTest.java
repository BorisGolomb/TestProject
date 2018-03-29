package com.epam.supplyon.test;

import com.epam.supplyon.Utils.TestConfig;
import com.epam.supplyon.model.User;
import com.epam.supplyon.model.UserFactory;
import com.epam.supplyon.pages.LoginPage;
import com.epam.supplyon.service.WebDriverHolder;
import org.testng.annotations.Test;

public class LoginTest {

    @Test

    public void loginTest() {


        String aplicationUrl = TestConfig.getApplicationUrl();
        WebDriverHolder.getInstance().get(aplicationUrl);
        User user = UserFactory.getUser();
        LoginPage loginPage = new LoginPage();
        loginPage.login(user.getUsername(), user.getPassword());

    }
}
