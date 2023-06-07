package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class amazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By aramaOncesi = By.id("sp-cc-accept");
    static By arama= By.cssSelector("#twotabsearchtextbox");
    static By aramaTikla= By.cssSelector("#nav-search-submit-button");
    static By filtreleme = By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']");
    static By appleSec = By.cssSelector("    body > div:nth-child(1) > div:nth-child(28) > div:nth-child(9) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > span:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)\n");
    static By ilkUrun = By.cssSelector("  img[alt='Apple 2021 AirPods Pro (MagSafe Şarj Kutulu)'] ");
    static By sepeteEkle = By.cssSelector("  #add-to-cart-button");

   // static By geriGel = By.cssSelector(    "attach-close_sideSheet-link");
    static By sepeteGit = By.cssSelector(    "    div[id='nav-cart-text-container'] span[class='nav-line-2']");

    static By sepetKontrol = By.cssSelector(    "  .a-truncate-cut");

    public amazonPages(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    public void anaSayfaGelir() {
        
    }

    public void maddeleriKabulEt() {
        elementHelper.tiklama(aramaOncesi);
    }

    public void urunAraTikla() {
        elementHelper.tiklama(arama);
    }

    public void urunIsminiYaz() {
        elementHelper.yaziGonder(arama,"airpods");

    }

    public void aramaButonunaTıkla() {
        elementHelper.tiklama(aramaTikla);
    }

    public void FiltlrelemeSec() {
        elementHelper.tiklama(filtreleme);
    }

    public void AppleOlarakSec() {
        elementHelper.tiklama(appleSec);

    }

    public void ilkCikanUruneTikla() {
        elementHelper.tiklama(ilkUrun);

    }

    public void UrunuEkle() {

        elementHelper.tiklama(sepeteEkle);
       // elementHelper.tiklama(geriGel);
        elementHelper.tiklama(sepeteGit);

    }

    public void sepetKontrolEt() {
        elementHelper.elemanKontrol(sepetKontrol);
    }
}
