import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTests extends TestBase {

  @Test
  public void loginTests() {
    driver.get("http://localhost/litecart/admin/login.php");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

}
