package Page;

import WebDriver.web;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {

    public void clickThis(By locator){
        web.getDriver().findElement(locator).click();
    }
    public void waitAsec(){
        web.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void selectPage(By locator, String name){
        List<WebElement> myList= web.getDriver().findElements(locator);
        for(WebElement fin : myList){
            if(fin.getText().equalsIgnoreCase(name)){
                System.out.println(fin.getText());
                fin.click();
            }
        }


    }
    public void scrollDown3(){
        JavascriptExecutor js = (JavascriptExecutor)web.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void sendName(By locator, String name){
        WebElement sendThis = web.getDriver().findElement(locator);
        sendThis.sendKeys(name);
    }
    public void waitAMin(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebElement findElementFluentWait(final By locator) {
        Wait fwait = new FluentWait(web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element not found i 30 sec");
        WebElement element = (WebElement) fwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return web.getDriver().findElement(locator);
            }
        });
        return element;
    }
}
