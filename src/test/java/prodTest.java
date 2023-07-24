import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class prodTest {

    public WebDriver driver;

    @Test
    public void testPodcastsPage() {
        driver = new ChromeDriver();
        driver.get("https://cms.paramount.com/about/podcasts");
        Assert.assertTrue(driver.getTitle().trim().equalsIgnoreCase("Podcasts | Paramount"));
        driver.quit();
    }
}
