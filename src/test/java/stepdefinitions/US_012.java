package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_012 {
    LoginPage page = new LoginPage();

    @Given("Kullanici {string}syafasina gider")
    public void kullaniciSyafasinaGider(String adres) {
        Driver.getDriver().get(adres);


    }

    @Then("kullanici {string} linki aktif ve görünür oldugunu dogrular")
    public void kullaniciLinkiAktifVeGörünürOldugunuDogrular(String arg0) {
        Assert.assertTrue(page.sifremiUnuttumLinki.isDisplayed());
        Assert.assertTrue(page.sifremiUnuttumLinki.isEnabled());
    }

    @Then("kullanici {string} linkinin altı çizili oldugunu dogrular")
    public void kullaniciLinkininAltıÇiziliOldugunuDogrular(String arg0) {
        String decoration = page.sifremiUnuttumLinki.getCssValue("text-decoration");
        System.out.println("cssValue = " + decoration);
        Assert.assertTrue(decoration.contains("underline"));
    }

    @And("kullanici {string} linkine tiklar")
    public void kullaniciLinkineTiklar(String arg0) {
        page.sifremiUnuttumLinki.click();
    }

    @Then("kullanici sayfa adresinin {string} ifadesini icerdigini dogrular")
    public void kullaniciSayfaAdresininIfadesiniIcerdiginiDogrular(String endPoint) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        Assert.assertTrue(currentUrl.contains(endPoint));


    }
}
