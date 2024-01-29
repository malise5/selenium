package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

  public WebDriver driver;
  public Properties prop = new Properties();
  public Properties loc = new Properties();
  public FileReader fr;
  public FileReader fr1;

  @BeforeMethod
  public void setUp() throws IOException {
    if (driver == null) {
      System.out.println("Path is " + System.getProperty("user.dir"));
      fr = new FileReader(System.getProperty("user.dir") + "/src/test/resources/configfiles/config.properties");
      fr1 = new FileReader(
          System.getProperty("user.dir") + "/src/test/resources/configfiles/locators.properties");

      prop.load(fr);
      loc.load(fr1);
    }

    if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
      driver = new ChromeDriver();
      driver.get(prop.getProperty("testurl"));

    } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
      driver = new FirefoxDriver();
      driver.get(prop.getProperty("testurl"));
    }

  }

  @AfterMethod
  public void tearDown() {
    driver.close();
    System.out.println("Driver closed successfully");

  }
}
