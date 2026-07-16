package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyStepdefs {
    WebDriver driver =new ChromeDriver();
    Actions act = new Actions(driver);

    @Given("Here we launch the browser and navigate to the application")
    public void hereWeLaunchTheBrowserAndNavigateToTheApplication() {
        // Code to launch the browser and navigate to the application
        driver.get("http://uitestingplayground.com/");
    }



    @When("user clicks on mouse action linktext")
    public void userClicksOnMouseActionLinktext() {
        driver.findElement(By.xpath("//a[@href='/mouseover']")).click();

    }

    @Then("we should be redirect to the mouse action page and verify hover over the element and perform right click and double click actions")
    public void weShouldBeRedirectToTheMouseActionPageAndVerifyHoverOverTheElementAndPerformRightClickAndDoubleClickActions() {
        // Add your action implementation here
        act.moveToElement(driver.findElement(By.xpath("//a[@title='Click me']"))).perform();
        String attribute=driver.findElement(By.xpath("//a[@title='Active Link']")).getDomAttribute("title");
        System.out.println(attribute);
        act.click(driver.findElement(By.xpath("//a[@title='Active Link']"))).perform();
        driver.quit();
        driver.close();

    }
}
