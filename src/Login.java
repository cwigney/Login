import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Login {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/Users/Jody1/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement((By.id("email")));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));

        email.sendKeys("cwigney1995@gmail.com");
        password.sendKeys("PPBb1gred");
        login.click();


    }
}
