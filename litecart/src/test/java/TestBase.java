import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {
  protected WebDriver driver;
  private WebDriverWait wait;
  @Before
  public void start() {
    driver = new ChromeDriver();
    //System.setProperty("webdriver.gecko.driver","C:/Tools/geckodriver.exe");
    //System.setProperty("webdriver.firefox.bin","C:/Program Files/Mozilla Firefox/firefox.exe");
    //driver = new FirefoxDriver();
    //driver = new EdgeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
