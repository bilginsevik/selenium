import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class base_test {
WebDriver driver;

    @Before
public void setUp(){
        driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.englishhome.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown(){
        driver.quit();
    }
@Test
    public void name(){

        WebElement yeniurunler=driver.findElement(By.xpath("//span[text()='Yeni Ürünler']"));
        yeniurunler.click();

        driver.navigate().back();

        WebElement dekorasyon=driver.findElement(By.xpath("//span[text()='Dekorasyon']"));
        dekorasyon.click();

        WebElement ilkUrun=driver.findElement(By.xpath("//div[@class='ItemOrj col-4'][1]"));
        ilkUrun.click();

        String ExpectedProduct= driver.findElement(By.xpath("//span[text()='Star Yılbaşı Mum 10 cm Gold']")).getText();
        WebElement sepetekle= driver.findElement(By.xpath(" //div[@class='basketBtn']"));
        sepetekle.click();
        WebElement closebtn=driver.findElement(By.xpath("  //a[@class='tici-noty-notification-close-btn']"));
        closebtn.click();

        WebElement sepetim=driver.findElement(By.xpath(" //div[@class='svgIcon cart-svg']"));
        sepetim.click();
        WebElement delete= driver.findElement(By.xpath(" //div[@class='miniCartButtonSil']"));
        delete.click();

       // WebElement actualProduct= driver.findElement(By.xpath("a[text()='Star Yılbaşı Mum 10 cm Gold']"));
        //assertEquals(ExpectedProduct,actualProduct);
    }
}
