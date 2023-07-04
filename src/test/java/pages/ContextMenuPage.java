package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage extends BasePage {
    public static final By HOT_SPOT = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void rightClickHotSpot(){

        actions.contextClick(driver.findElement(HOT_SPOT)).build().perform();
    }

    public String getText(){
        Alert alert= driver.switchTo().alert();
        return alert.getText();

    }

    public void alertClose(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
