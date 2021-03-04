package Page.FASpage;

import Page.BasePage;
import WebDriver.web;
import org.junit.Assert;
import org.openqa.selenium.By;

public class accessControl extends BasePage {

    By toTop = By.id("myBtn");
    By menuBar = By.id("logo");
    By CUpage = By.xpath("//a[text()='Contact US']");


    public void goDown2(){
        scrollDown3();
        clickThis(toTop);
    }
    public void contact(String name){
        clickThis(menuBar);
        selectPage(CUpage, name);
    }
    public void titleP(String name){
        String n = web.getDriver().getTitle();
        System.out.println(n);
        Assert.assertEquals(n, name);
    }


}
