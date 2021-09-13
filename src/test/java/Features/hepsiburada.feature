Feature: Login olup sepete bir kitap ürünü ekleyerek “Havale” ödeme seçeneği ile siparişi tamamlama
  ve sonrasında siparişi iptal eden bir senaryoyu test otomasyonu ile yazınız.

  Scenario: havale ile siparis
    Given hepsiburada sayfasi acilir
    When login olunur
    And kitap arama yapilir
    And urun sepete eklenir
    Then urunun sepette oldugu kontrol edilir
    And havale ile odeme secilir
    And siparis tamamla butonuna basilir
    And siparis iptal edilir
    Then siparisin iptal edildigi kontrol edilir