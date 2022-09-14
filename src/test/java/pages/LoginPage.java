package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy ( name = "email" )
    public WebElement emailInput;

    @FindBy ( name = "password" )
    public WebElement passwordInput;

    @FindBy ( xpath = "//button[@type='submit']" )
    public WebElement loginButton;

    @FindBy (xpath = "//a[text()= \"Şifremi Unuttum\"]")
    public WebElement sifremiUnuttumLinki;


}

//As a <type of user>, I want <activity> so that <business value>
// <Kullanici olarak>, <aktivite> gerceklestirmek istiyorum. Boylece < Fayda> saglayabilirim.

//user story leri PO yaziyor. Requerments User story bize hazir olarak geliyor
//AC Po yaziyor. Bizim teknoloji diline ceivyor BA


//agile ceremonies
//Sprint grooming(refinement) / Sprint planing / daily scrum  / sprint review(demo)/ sprint retro
// 2 haftalik 1 sprint
// 5 tester 9 = 45 1-8


















