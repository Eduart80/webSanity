package Page.FASpage;

import Page.BasePage;
import WebDriver.web;
import org.openqa.selenium.By;

public class contactUs extends BasePage {

    By iconHome = By.xpath("//i[@class='fa fa-home']");
    By inName = By.xpath("//input[@name='name']");
    By last = By.xpath("//input[@name='email']");
    By text = By.xpath("//textarea[@name='message']");
    By sendThis = By.xpath("//input[@type='submit']");




    public void enterName(String name){
        sendName(inName, name);
        System.out.println(name);
    }
    public void enterLast(String name){
        sendName(last, name);
        System.out.println(name);
    }
    public void textINs(String textIn){
        sendName(text, textIn);
        System.out.println(textIn);
    }
    public void sendT(){
        clickThis(sendThis);
    }
    public void testIn(){
        clickThis(iconHome);
        waitAsec();
        String m = web.getDriver().getCurrentUrl();
        System.out.println("Page URL is: "+ m );
    }


}
