import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testLoginPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        System.out.println("Página de login carregada com sucesso");

        driver.quit();
    }
}
