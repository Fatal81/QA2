import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.object.BaseFunc;
import java.lang.String;

import org.apache.logging.log4j.LogManager;


public class MyHomeWork {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    @Test
    public void MyDelfiTests() {
        LOGGER.info("This test check 3rd article and comments");
        System.setProperty("webdriver.chrome.driver" , "c://chromedriver.exe");
        LOGGER.info("Opening browser");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Open delfi home page");
        driver.get("https://rus.delfi.lv");
        LOGGER.info("Getting article");
        String text = driver.findElement(By.xpath(".//h1[contains(@class, 'headline__title')]")).getText().trim();
        System.out.println(text);
        LOGGER.info("Getting comments");
        String commentCount = driver.findElement(By.xpath(".//a[contains(@class, 'comment-count')]")).getText();
        System.out.println(commentCount);
        LOGGER.info("removes parentheses");
        String commentCountTrimmed = commentCount.substring(1, commentCount.length()-1);
        System.out.println(commentCount.substring(1, commentCount.length()-1));
        LOGGER.info("Check it");
        Assertions.assertEquals("В Латвии зафиксированы пять новых случаев заболевания Covid-19", text,"Wrong title");
        Assertions.assertEquals("22", commentCountTrimmed, "expected comment count 22, but was " + commentCountTrimmed);

        driver.close();
    }
}
