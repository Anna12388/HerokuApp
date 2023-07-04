package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{

    @Test
    public void checkFileUpload(){
       driver.get("https://the-internet.herokuapp.com/upload");

       File file = new File("//src/main/resources/lavanda-01-1904.jpeg");
       driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
       driver.findElement(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'example']/h3")).getText(), "File Uploaded!", "Other message");
    }
}