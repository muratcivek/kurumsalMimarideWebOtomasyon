package StepDefinitions;

import Pages.amazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    amazonPages amazonPages = new amazonPages(driver);
    @Given("Kullanıcı ana sayfaya gelir")
    public void kullaniciAnaSayfayaGelir() {
        amazonPages.anaSayfaGelir();
    }

    @When("Maddeleri kabul eder")
    public void maddeleriKabulEder() {
        amazonPages.maddeleriKabulEt();

    }

    @When("Ürün aramaya tıklar")
    public void urunAramayaTiklar() {
        amazonPages.urunAraTikla();
    }

    @When("Ürünün ismini yazar")
    public void urununIsminiYazar() {
        amazonPages.urunIsminiYaz();

    }

    @When("Arama butonuna tıklar")
    public void aramaButonunaTiklar() {
        amazonPages.aramaButonunaTıkla();

    }

    @When("Amazonun gönderiği ürünler için filtlreleme seçer")
    public void amazonunGonderigiUrunlerIcinFiltlrelemeSecer() {
        amazonPages.FiltlrelemeSec();

    }

    @When("Markayı Apple olarak seçer")
    public void markayiAppleOlarakSecer() {
        amazonPages.AppleOlarakSec();

    }

    @When("İlk çıkan ürüne tıklar")
    public void ilkCikanUruneTiklar() {
        amazonPages.ilkCikanUruneTikla();

    }

    @When("Sepete ürünü ekler")
    public void sepeteUrunuEkler() {
        amazonPages.UrunuEkle();

    }
    @When("Sepet ürün kontrol eder")
    public  void sepetKontrol(){
        amazonPages.sepetKontrolEt();

    }

}
