# Library-Management-System 
# Kütüphane Yönetim Sistemi
Bu uygulamada kütüphane yönetimi için bir sistem geliştirilmiştir. Kütüphanenin veritababnında kitaplar ve sistemde uyeler bulunmaktadır. 14 günden fazla süresi geçtiğinde uyenin ucretlendirme süresi başlatılacaktır. Yönetici bu işlemlerin hepsini sistemde gerçekleştirebilmektedir. 

### Kullanılan Kütüphaneler
  * [JFoenix](https://github.com/jfoenixadmin/JFoenix) - JavaFX Tasarım Kütüphanesi
  * [Apache Derby](https://db.apache.org/derby/) - Bağımsız İlişkisel Veritabanı 
  * [Apache Commons](https://commons.apache.org/) - Güvenlik için SHA hash oluşturmak
  * [GSon](https://github.com/google/gson) - JSON Kütüphanesi. Yapılandırmayı kaydetmek için kullanılır
  * [FontawesomeFX](https://bitbucket.org/Jerady/fontawesomefx) - Icon kütüphanesi
  
 Yöneticinin kullanıcı adı ve şifresi ‘admin’ .
  
  ![1](https://user-images.githubusercontent.com/8350817/42124661-c83cb54c-7c6f-11e8-916f-62c52c01494a.png)

Giriş yapıldıktan sonra açılacağa sayfa aşağıdaki şekilde gibidir.

![2](https://user-images.githubusercontent.com/8350817/42124662-c862967c-7c6f-11e8-8c95-dc0f8ab71488.png)

En üst kısmında MenuBar birleşeni kullanılmıştır. Ve orta kısmında ise Tab Menu kullanılmıştır.
Menubar da Dosya seçeneğinde Kapat seçeneği bulunmaktadır.Ekle seçeneğinde kullanıcı ve üye ekeleme seçeneği bulunmaktadır. View seçeneğinde kullanıcı ve üye tablosunun inceleme birde tam ekran yapma seçeneği bulunmaktadır. Yardım seçeneğinde ise yazılımcının bilgileri bulunmaktadır. Tab menüsünde kitap emanet ve yenileme seçeneği bulunmaktadır.

![3](https://user-images.githubusercontent.com/8350817/42124663-c886ff12-7c6f-11e8-9c90-d249eb02c576.png)

Kitap emanet kısmında kullanıcı ID si ve kitap ID sini kullanarak emanet verebilmektedir. Yenileme kısmında ise kitap süre yenileme yada kitap teslim işlmeleri gerçekleştirlmektedir.

![4](https://user-images.githubusercontent.com/8350817/42124664-c8a70370-7c6f-11e8-91f4-a8d2b3495770.png)

Üye ekleme işleminde üyenin ad, soyad, uye id, telefon ve mail adresini kullanarak veritabanına kaydedilebilmektedir ekranda gözüktüğü gibi.

![6](https://user-images.githubusercontent.com/8350817/42124665-c8c9e2d2-7c6f-11e8-93b7-e7ef502c0123.png)

Kitap ekleme seçeneğinde ise kitap adı, kitap idsi, kitap yazarı ve yayınevini kullanarak veritabanına kaydedilebilmektedir.

![7](https://user-images.githubusercontent.com/8350817/42124666-c8ea666a-7c6f-11e8-91d3-b2257a4c6fd9.png)

Üye listesi seçeneğinde ise üyelerin listesini bir tabloda gösterilebilmektedir yukarıda ekranda gözüktüğü gibi.

![8](https://user-images.githubusercontent.com/8350817/42124667-c90afe3e-7c6f-11e8-92db-56a280fcae80.png)

Kitap listesi seçeneğinde kitapların listesini bir tabloda gösterilebilmektedir yukarıda ekranda gözüktüğü gibi.

![9](https://user-images.githubusercontent.com/8350817/42124668-c94d002c-7c6f-11e8-9b64-9803f3f4a374.png)

Ayarlar seçeneğinde ise emanet gün sayısını, ceza parasını, kullanıcı adını ve şifreyi değiştirilebilmektedir yukarıda gözüktüğü gibi.

Yardım kısmında yazılımcının bilgileri çıkmaktadır yukarıda gözüktüğü gibi.

￼Kitap ID numarasını girirek kitabın kime emanete verildiğini göstermektedir ve buradan emanet günü uzatılabilir veya geri alınabilir.

￼Onaylamak için emin olup olmadığımız için emin olmak alertBox lar kullanılmıştır.
