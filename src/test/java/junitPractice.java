import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class junitPractice {
 public WebDriver driver;

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("www.next.co.uk");
        driver.manage().window().maximize();
        driver.close();

        //System.out.println("run the test method");
    }

@After
    public void close(){
        driver.close();
}

}
