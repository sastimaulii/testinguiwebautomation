package testinguiwebautomation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();

        //konfigurasi ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Menjalankan tanpa jendela UI
        options.addArguments("--no-sandbox"); // Penting untuk environment Linux/Docker
        options.addArguments("--disable-dev-shm-usage"); // Mencegah crash karena keterbatasan memori di server
        options.addArguments("--window-size=1920,1080"); // Menentukan resolusi layar virtual

        // options ChromeDriver
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}