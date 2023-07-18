import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data {

    private By btnLoginFree = By.xpath("//div[@class='r1yVH']//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L']");
    private By btnJoinFree = By.linkText("Join Unsplash");
    private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
    private By inputLasttName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputUsername = By.xpath("//div[@class='form-group']//input[@id='user_username']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btnJoin = By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");

    @Test
    public void registration(){
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.get(getDate.gerUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLoginFree).click();
        driver.findElement(btnJoinFree).click();
        driver.findElement(inputFirstName).sendKeys(getDate.firstName);
        driver.findElement(inputLasttName).sendKeys(getDate.lastName);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputUsername).sendKeys(getDate.username);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btnJoin).click();
        driver.quit();

    }

}
