//package com.qacart.todo.testcases;
//
//import com.qacart.todo.apis.UserApi;
//import com.qacart.todo.base.BaseTest;
//import com.qacart.todo.models.User;
//import com.qacart.todo.pages.RegisterPage;
//import io.restassured.response.Response;
//import org.openqa.selenium.Cookie;
//import org.testng.annotations.Test;
//
//public class DummyTest extends BaseTest {
//
//    @Test
//    public void dummy() throws InterruptedException {
//        User user = new User();
//        Response res = UserApi.getInstance().register(user);
//
//        String access_token = res.path("access_token");
//        String userId = res.path("userID");
//        String firstName = res.path("firstName");
//
//        Cookie accessTokenCookie = new Cookie("access_token", access_token);
//        Cookie userIDCookie = new Cookie("userID", userId);
//        Cookie firstNameCookie = new Cookie("firstName", firstName);
//
//        RegisterPage.getInstance().load(driver);
//        driver.manage().addCookie(accessTokenCookie);
//        driver.manage().addCookie(userIDCookie);
//        driver.manage().addCookie(firstNameCookie);
//        RegisterPage.getInstance().load(driver);
//
//        Thread.sleep(12000);
//    }
//}
