package stepDefinition;

import Page.FASpage.accessControl;
import Page.FASpage.contactUs;
import Page.FASpage.mainPage;
import WebDriver.web;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainPg {
        mainPage mp = new mainPage();
        accessControl ac = new accessControl();
        contactUs cu = new contactUs();

        @When("^i reach FAS website and get title$")
        public void start(){
            mp.clickMenu();
        }
        @And("^Select page '(.+)'$")
        public void selectPage(String name){
            mp.clickPageTo(name);
        }
        @Then("^veryfy website title is '(.+)'$")
        public void assertPageTitle(String name){
            mp.webTitle(name);
            mp.waitAsec();
        }
        @And("^in page scroll down click btn to top$")
        public void scrollDown(){
           ac.goDown2();
        }
        @And("^click menu to navigate to '(.+)'$")
        public void gotoMenu(String name){
            ac.contact(name);
            ac.waitAMin();
        }
        @When("^verify the page title '(.+)'$")
        public void titlePage(String name){
            ac.titleP(name);
        }
        @When("^create name '(.+)'$")
        public void nameIn(String name){
            cu.enterName(name);
            cu.waitAMin();
        }
        @And("^enter email '(.+)'$")
        public void lastIn(String name){
            cu.enterLast(name);
            cu.waitAMin();
        }
        @Then("^enter text '(.+)'$")
        public void textIn(String text){
            cu.textINs(text);
            cu.waitAMin();
        }
        @When("^click send button$")
        public void sendBtn(){
            cu.sendT();
            cu.waitAsec();
        }
        @When("^click home button for main page assert page address$")
        public void testIt(){
            cu.testIn();

        }




}
