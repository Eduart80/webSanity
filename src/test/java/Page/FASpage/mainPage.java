package Page.FASpage;

import Page.BasePage;
import WebDriver.web;
import org.openqa.selenium.By;
import org.testng.Assert;

public class mainPage extends BasePage {

By menuBar = By.id("logo");
By ACpage = By.xpath("//a[text()='Access Control']");
////////////////////////////////////
    private static String webTitle;
/////////////////////////////////
public void clickMenu(){
    String n = web.getDriver().getTitle();
    System.out.println(n);
    clickThis(menuBar);
    waitAsec();
}
public void clickPageTo(String name){
    selectPage(ACpage, name);
    waitAsec();
    String nextPage =web.getDriver().getTitle();
    webTitle=nextPage;
    System.out.println(nextPage);
}
public void webTitle(String name){
    Assert.assertEquals(webTitle, name, "title not correct from webPage");
}



}
