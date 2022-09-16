#
#http://test.kese.nl/new_room
#"Ev Tipi" başlığı görünür olmalıdır.
#"Odanız hangi ev türüde yer alıyor, belirtiniz." açıklaması görünür olmalıdır.
#"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri görünür olmalıdır.
#"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri seçilebilir olmalıdır.
#"Odami kiraya vermek istiyorum" ve "Karşılıklı oda değişimi yapmak istiyorum" checkboxları kullanılabilir olmalıdır.
#1. stepte, sayfanın üst kısmına "1 / 11" yazısı görünür olmalıdır.

  @regression
  Feature: Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.

  Background: Login ve ilgili sayfaya gitme
    Given kullanici "https://kese.nl/login" sayfasina gider
    And kullanici "kullanici2@gmail.com" ve "mustafa123"bilgileri ile sisteme gireer
    Then kullanici "https://kese.nl/new_room" sayfasina giderr

    Scenario: US_056 TC_001 Ev Tipi" başlığı görünür olmalıdır.
      Then kullanici ev tipi basliginin gorunur oldugunu dogrular


    Scenario: US_056 TC_002 Odanız hangi ev türüde yer alıyor, belirtiniz." açıklaması görünür olmalıdır.
      Then kullanici ev tipi aciklamasinin gorunur oldugunu dogrular


    Scenario: US_056 TC_003 Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri görünür olmalıdır.
      Then kullanici ev tipi seceneklerinin gorunur oldugunu dogrular


    Scenario: US_056 TC_004 Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri seçilebilir olmalıdır.
      Then kullnici mustakil ev secenegine tiklar
      And kullnaici mustakil ev seceneginin secili oldugunu dogrular
      Then kullnici Apartman Dairesi secenegine tiklar
      And kullnaici Apartman Dairesi seceneginin secili oldugunu dogrular
      Then kullnici Stüdyo Daire secenegine tiklar
      And kullnaici Stüdyo Daire seceneginin secili oldugunu dogrular


    Scenario: US_056 TC_005 Odami kiraya vermek istiyorum" ve "Karşılıklı oda değişimi yapmak istiyorum" checkboxları kullanılabilir olmalıdır.
      And kullanici odami kiraya vermek istiyorum secenegine tiklar
      Then kullanici odami kiraya vermek istiyorum seceneginiin secili oldugunu dogrular
      And kullanici Karşılıklı oda değişimi yapmak istiyorum secenegine tiklar
      Then kullanici Karşılıklı oda değişimi yapmak istiyorum seceneginiin secili oldugunu dogrular

    Scenario: US_056 TC_006 1. stepte, sayfanın üst kısmına "1 / 11" yazısı görünür olmalıdır.
      And kullanici step durum bilgisinin "1 / 11" oldugunu dogrular



