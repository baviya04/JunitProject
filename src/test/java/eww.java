import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class eww {

@Test
    public void trail(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options =new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(options);
}
}
