package TestCase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    public static WebDriver driver;
    public static String baseUrl;

    @Given("hepsiburada sayfasi acilir")
    public void hepsiburadaSayfasiAcilir() {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = "https://www.hepsiburada.com";
        driver.get(baseUrl);
    }

    @When("login olunur")
    public void loginOlunur() throws InterruptedException {
        driver.findElement(By.xpath("//*[@title=\"Giriş Yap\"]")).click();
        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("txtUserName")).sendKeys("yagmurhusem@gmail.com");
        driver.findElement(By.id("txtPassword")).sendKeys("Telekom_123");
        driver.findElement(By.id("btnLogin")).click();

    }



}
