package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.NewRoomPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_056_stepDef {
    LoginPage loginPage=new LoginPage();
    NewRoomPage newRoomPage= new NewRoomPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String adres) {
        Driver.getDriver().get(adres);


    }

    @And("kullanici {string} ve {string}bilgileri ile sisteme gireer")
    public void kullaniciVeBilgileriIleSistemeGireer(String email, String sifre) {
        loginPage.emailInput.sendKeys(email);
        loginPage.sifreInput.sendKeys(sifre + Keys.ENTER);
        BrowserUtilities.waitFor(5);

    }
    @Given("kullanici {string} sayfasina giderr")
    public void kullaniciSayfasinaGiderr(String adres) {
        Driver.getDriver().get(adres);
        BrowserUtilities.waitFor(3);

    }
    @Then("kullanici ev tipi basliginin gorunur oldugunu dogrular")
    public void kullaniciEvTipiBasligininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.evTipiBaslik.isDisplayed());

    }

    @Then("kullanici ev tipi aciklamasinin gorunur oldugunu dogrular")
    public void kullaniciEvTipiAciklamasininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.evTipiAciklama.isDisplayed());
    }

    @Then("kullanici ev tipi seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciEvTipiSeceneklerininGorunurOldugunuDogrular() {
        Assert.assertTrue(newRoomPage.mustakilEvSecenegi.isDisplayed());
        Assert.assertTrue(newRoomPage.apartmanDairesiSecenegi.isDisplayed());
        Assert.assertTrue(newRoomPage.studyoDaireSecenegi.isDisplayed());
    }

    @Then("kullnici mustakil ev secenegine tiklar")
    public void kullniciMustakilEvSecenegineTiklar() {
        newRoomPage.mustakilEvSecenegi.click();
    }

    @And("kullnaici mustakil ev seceneginin secili oldugunu dogrular")
    public void kullnaiciMustakilEvSecenegininSeciliOldugunuDogrular() {
        String cssValue=newRoomPage.mustakilEvSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)",cssValue);
    }

    @Then("kullnici Apartman Dairesi secenegine tiklar")
    public void kullniciApartmanDairesiSecenegineTiklar() {
        newRoomPage.apartmanDairesiSecenegi.click();
    }

    @And("kullnaici Apartman Dairesi seceneginin secili oldugunu dogrular")
    public void kullnaiciApartmanDairesiSecenegininSeciliOldugunuDogrular() {
        String cssValue=newRoomPage.apartmanDairesiSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)",cssValue);
    }

    @Then("kullnici Stüdyo Daire secenegine tiklar")
    public void kullniciStüdyoDaireSecenegineTiklar() {
        newRoomPage.studyoDaireSecenegi.click();
    }

    @And("kullnaici Stüdyo Daire seceneginin secili oldugunu dogrular")
    public void kullnaiciStüdyoDaireSecenegininSeciliOldugunuDogrular() {
        String cssValue=newRoomPage.studyoDaireSecenegi.getCssValue("border-color");
        Assert.assertEquals("rgb(255, 193, 7)",cssValue);
    }

    @And("kullanici odami kiraya vermek istiyorum secenegine tiklar")
    public void kullaniciOdamiKirayaVermekIstiyorumSecenegineTiklar() {
        newRoomPage.odamiKirayaVermekIstiyorumCheckBox.click();
    }

    @Then("kullanici odami kiraya vermek istiyorum seceneginiin secili oldugunu dogrular")
    public void kullaniciOdamiKirayaVermekIstiyorumSeceneginiinSeciliOldugunuDogrular() {
        newRoomPage.odamiKirayaVermekIstiyorumCheckBox.isSelected();
    }

    @And("kullanici Karşılıklı oda değişimi yapmak istiyorum secenegine tiklar")
    public void kullaniciKarşılıklıOdaDeğişimiYapmakIstiyorumSecenegineTiklar() {
        newRoomPage.karsilikliOdaDegisimiYapmakIstiyorumCheckBox.click();
    }

    @Then("kullanici Karşılıklı oda değişimi yapmak istiyorum seceneginiin secili oldugunu dogrular")
    public void kullaniciKarşılıklıOdaDeğişimiYapmakIstiyorumSeceneginiinSeciliOldugunuDogrular() {
        newRoomPage.karsilikliOdaDegisimiYapmakIstiyorumCheckBox.isSelected();
    }

    @And("kullanici step durum bilgisinin {string} oldugunu dogrular")
    public void kullaniciStepDurumBilgisininOldugunuDogrular(String bilgi) {
        System.out.println("newRoomPage.stepBilgisi.getText() = " + newRoomPage.stepBilgisi.getText());
        Assert.assertTrue(newRoomPage.stepBilgisi.getText().contains(bilgi));

    }
}
