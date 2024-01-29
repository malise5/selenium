package testcase;

import java.time.Duration;

// import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest {

  // @Test(dataProvider = "testdata")
  @Test(dataProviderClass = ReadXLSdata.class, dataProvider = "testData")
  public void LoginTest(String username, String password) throws InterruptedException {

    driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
    driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
    driver.findElement(By.xpath(loc.getProperty("next_button"))).click();

    Duration timeout = Duration.ofSeconds(20);
    WebDriverWait wait = new WebDriverWait(driver, timeout);

    // Wait for the password field to be clickable
    // driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("Ha@0703750755");
    try {
      WebElement passwordInput = wait
          .until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("pwd_field"))));
      passwordInput.sendKeys(password);

    } catch (Exception e) {
      e.printStackTrace();
    }

    // Wait for the login next button to be clickable
    Thread.sleep(4000);
    driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
    Thread.sleep(8000);
  }

  // @DataProvider(name = "testdata")
  // public Object[][] tData() {
  // return new Object[][] {
  // { "halka@gmail.com", "Ha@3750755" },
  // { "halkan72@gmail.com", "Ha@070355" },
  // { "halkanomalise72@gmail.com", "Ha@0703750755" }
  // };
  // }

}
