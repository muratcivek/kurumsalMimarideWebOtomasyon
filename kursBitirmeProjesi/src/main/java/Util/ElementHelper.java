package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import javax.swing.text.Element;
import java.sql.Driver;
import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper (WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }
    public WebElement kontrolElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
        //verilen eleman geldiğinde yani yüklendiğinde bu return çalışacak.
    }
    public WebElement elemanBul(By key){
        WebElement element = kontrolElement(key);
        //bulunan elemanı aldık.
        return element;
    }
    public void tiklama(By key){
        elemanBul(key).click();
        //aldıgımız elemana tıkladık.
    }
    public void yaziGonder (By key,String yazi){
        elemanBul(key).sendKeys(yazi);
        //tıklanılan elemana istediğimiz yazıyı göndericez
    }
    public void elemanKontrol (By key){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(key)));
    }
}
