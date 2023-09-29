package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {

    private WebDriver driver;

    @Given("^user is accessing the login page$")
    public void goToLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
    }

    @When("^user enters the credentials$")
    public void enterTheCredentials(){
//        driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("123");
//        driver.findElement(By.id("//*[@id='input-email']")).sendKeys("908pi");

    }

}
