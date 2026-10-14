# Java PDF Resume Generator

Bu proje, Java kullanılarak nesne yönelimli programlama (OOP) prensiplerine uygun şekilde PDF formatında özgeçmiş (CV) üreten bir konsol uygulamasıdır. 

## Kullanılan Teknolojiler ve Bileşenler
* **Java:** Temel programlama dili.
* **Maven:** Bağımlılık yönetimi ve proje derleme aracı.
* **OpenPDF (com.github.librepdf):** PDF oluşturma işlemleri için kullanılan açık kaynaklı kütüphane. Kütüphane seçilme nedeni, iText'in eski sürümlerine dayanması, hafif olması ve temel metin/görsel ekleme işlemleri için ideal olmasıdır.
* **Sınıf Yapısı:** 
  * `Main.java`: Uygulamanın giriş noktasıdır. Sadece nesne oluşturma ve metodu tetikleme görevini üstlenir.
  * `ResumeGenerator.java`: PDF dosyasını bellek üzerinde inşa eden, fotoğraf ve metinleri `Document` nesnesine ekleyen ve işlemi dosyaya yazan sınıftır. Kapsülleme kuralına uyulması amacıyla main dosyasından ayrılmıştır.
