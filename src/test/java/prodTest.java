import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.percy.selenium.Percy;

import java.util.Arrays;


public class prodTest {

    public WebDriver driver;
    private static Percy percy;

    @Test
    public void testPodcastsPage() {
        driver = new ChromeDriver();
        percy = new Percy(driver);
        driver.get("https://cms.paramount.com/about/podcasts");
        Assert.assertTrue(driver.getTitle().trim().equalsIgnoreCase("Podcasts | Paramount"));
        percy.snapshot("podcasts_page.png", Arrays.asList(1440));
        driver.quit();
    }
}
