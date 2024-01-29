// package selenium;

// import org.junit.After;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;

// public class FunxTest {

// private WebDriver driver;

// @Before
// public void setUp() {
// // Set the path to the chromedriver executable
// // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
// driver = new ChromeDriver();
// driver.manage().window().maximize();
// }

// @After
// public void tearDown() {
// try {
// Thread.sleep(2000);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// driver.quit();
// }

// @Test
// public void testLogin() {
// getLoginButton();

// // Verify that login was successful (you might need to adjust this based on
// your
// // application)
// WebElement welcomeMessage =
// driver.findElement(By.xpath("//div[@id='welcome-message']"));
// Assert.assertEquals("Welcome message not found", "Welcome, Admin!",
// welcomeMessage.getText());
// }

// @Test
// public void testAddDoctor() {
// getLoginButton();
// testLogin(); // Assuming you are logged in before adding a doctor

// addDoctor();

// // Verify that the doctor was added successfully (you might need to adjust
// this
// // based on your application)
// WebElement successMessage =
// driver.findElement(By.xpath("//div[@id='success-message']"));
// Assert.assertEquals("Doctor not added successfully", "Doctor added
// successfully!", successMessage.getText());
// }

// private void addDoctor() {
// WebElement addDoctor =
// driver.findElement(By.xpath("(//button[normalize-space()='Add
// Doctor'])[1]"));
// addDoctor.click();

// WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
// WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
// WebElement specialization =
// driver.findElement(By.xpath("//input[@id='specialization']"));

// // Input the credentials
// name.sendKeys("kudez");
// email.sendKeys("kudezx@gmail.com");
// specialization.sendKeys("Cardiologist");

// WebElement addAll =
// driver.findElement(By.xpath("//button[normalize-space()='Add']"));
// addAll.click();
// }

// private void getLoginButton() {
// driver.get("http://127.0.0.1:8081/e-health-app");

// // Find the username and password fields by their HTML attributes
// WebElement usernameInput =
// driver.findElement(By.xpath("//input[@placeholder='Enter Username ? ']"));
// WebElement passwordInput =
// driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));

// // Input the credentials
// usernameInput.sendKeys("Admin");
// passwordInput.sendKeys("123");

// // Find and click the login button
// WebElement loginButton =
// driver.findElement(By.xpath("//button[normalize-space()='Login']"));
// loginButton.click();
// }
// }
