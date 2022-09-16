@smoke  @regression
Feature: Bir kullanıcı olarak "/login" sayfasına girdiğimde, şifremi unuttum bölümüne ulaşabilmeliyim

  Background:
    Given Kullanici "https://kese.nl/login"syafasina gider

  Scenario: TC-001 "Şifremi Unuttum" linki aktif ve görünür olmalıdır.
    Then kullanici "Şifremi Unuttum" linki aktif ve görünür oldugunu dogrular

  Scenario: TC-002 "Şifremi Unuttum" linkinin altı çizili olmalıdır.
    Then kullanici "Şifremi Unuttum" linkinin altı çizili oldugunu dogrular

  Scenario: TC-003 Linke tıklanınca "http://test.kese.nl/forgot_password" sayfasına gidilmelidir.
    And  kullanici "Şifremi Unuttum" linkine tiklar
    Then kullanici sayfa adresinin "/forgot_password" ifadesini icerdigini dogrular



