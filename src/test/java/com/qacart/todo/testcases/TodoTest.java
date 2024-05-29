package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.models.User;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.RegisterPage;
import com.qacart.todo.pages.TodoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAdddATodo(){
        User user = new User();
        RegisterPage.getInstance().load(driver.get());
        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        NewTodoPage.getInstance().addTodoUsingApi(user, "Learn Selenium");
        TodoPage.getInstance().load(driver.get());
        String text = TodoPage.getInstance().getTodoText(driver.get());
        Assert.assertEquals(text, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteATodo(){
        User user = new User();
        RegisterPage.getInstance().load(driver.get());
        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        TodoPage.getInstance().clickOnPlusButton(driver.get());
        NewTodoPage.getInstance().addToDo(driver.get(),"Learn Selenium");
        TodoPage.getInstance().deleteTodo(driver.get());
        boolean isNoTodoDisplayed = TodoPage.getInstance().isNoTodoMessageDisplayed(driver.get());
        Assert.assertTrue(isNoTodoDisplayed);
    }
}
