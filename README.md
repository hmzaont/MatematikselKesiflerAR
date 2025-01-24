# **Çığır Açan Buluşlar - Uçak İçi Eğlence Sistemi (MathMagicAR) (AR Uygulaması)**

## **215541040 | HAMZA ONAT**

### Trello : [MathMagicAR | Trello](https://trello.com/b/Xkfn7KbW/ymgk-matematiksel-buluslar-ar-projesi)
### Web Site : [MathMagicAR | Web Site](https://hmzaontdev.github.io/)

Bu proje, uçak içi eğlence sistemi için geliştirilmiş bir **Artırılmış Gerçeklik (AR)** uygulamasıdır. Uygulama, "Çığır Açan Buluşlar" temasıyla çocuklara yönelik etkileşimli bir eğitim ve eğlence deneyimi sunmayı amaçlamaktadır. Uygulama, kullanıcıların **bilim insanlarının çığır açan icatlarını ve keşiflerini** AR teknolojisiyle görselleştirmelerini sağlar.

---

## **🎯 Proje Özeti**

- **Amaç:** Uçak içi eğlence sistemlerinde, çocuklar için interaktif bir artırılmış gerçeklik deneyimi sağlamak.
- **Tema:** Çığır Açan Buluşlar (Matematik ve Bilim İnsanları).
- **Modeller:** Uygulama içinde **glb** formatında bilimsel buluşlara yapan insanlara ilişkin modeller bulunmakta ve kullanıcı, bunlarla etkileşime girip bu insanların ne yaptıklarına dair bilgi alabilmektedir.
- **Hedef Kitle:** Çocuklar ve genç yolcular.

## 🛠️ Kullanılan Teknolojiler ve Araçlar

- **Programlama Dili:** Kotlin
- **Geliştirme Ortamı:** Android Studio
- **AR Kütüphanesi:** SceneView
- **Grafikler:** Android Adaptive Icons, GLB 3D modelleri
- **Test Araçları:** Android Emulator, Fiziksel cihaz testleri
- **Veritabanı:** `SharedPreferences`

---

## **📌 Proje Aşamaları**

### **1. Hafta: Proje Planlaması**
- Proje konsepti belirlendi: Çocuklara bilim insanlarını ve icatlarını tanıtan bir uçak içi AR eğlence sistemi.
- Kullanılacak AR teknolojileri ve araçlar araştırıldı (\u00f6r. **SceneView**, **Blender**).
- Projenin mimari yapısı ve gereklilikleri belirlendi.

### **2. Hafta: 3D Modelleme ve Veri Hazırlığı**
- Bilim insanları ve icatlarına yönelik figürler ve grafikler seçildi.
- Blender kullanılarak 3D modeller tasarlandı ve **.glb** formatına dönüştürüldü.
- Modeller, `assets/models/` klasörününe yerleştirildi.
- **Örnek Model:** Arşimet'in modeli 3D model ile temsil edildi.
<img src="https://github.com/user-attachments/assets/b0214374-5656-49b8-b7e8-5149edf4984b" alt="Matematik Dahisi Modeli" width="300">

### **3. Hafta: AR Entegrasyonu**
- SceneView kullanılarak artırılmış gerçeklik entegrasyonu tamamlandı.
- Modeller sahneye yerleştirildi ve etkileşim özellikleri (dokunma, döndürme, yakınlaştırma) eklendi.

### **4. Hafta: Kullanıcı Arayüzü ve Deneyim Tasarımı**
- Çocuk dostu bir kullanıcı arayüzü (UI) tasarlandı.
- **Animasyonlu bilgi panelleri** ve etkileşimli ikonlar eklendi.
- Modellerle ilgili bilgi veren açılır pencereler tasarlandı.

### **5. Hafta: Test ve Optimizasyon**
- Uygulama farklı cihazlar üzerinde test edildi (tablet, telefon).
- Performans optimizasyonları yapıldı ve görsel hatalar giderildi.
- **Eklenti:** Uygulama çalışmadığında hata mesajları ve rehber ekranları eklendi.

### **6. Hafta: Kullanıcı Giriş Ekranı Entegrasyonu**
- Kullanıcı giriş ekranı tasarlandı.
- Kullanıcıların e-posta ve şifre ile giriş yapabileceği bir sistem entegre edildi.
- Giriş ekranı, testlerle kontrol edildi.

### **7. Hafta: Yayın ve Geri Bildirim**
- Tüm proje dosyaları GitHub’a yüklendi.
- **GitHub Pages** üzerinden proje web sitesi yayınlandı.
- Kullanıcı geri bildirimlerine göre son düzenlemeler yapıldı.

---

## **🖼️ Ekran Görüntüleri**

### **Kullanıcı Giriş Ekranı**
<img src="https://github.com/user-attachments/assets/98ff15b9-8e40-4d0e-a79f-53082e4f0cdb" alt="Kullanıcı Giriş Ekranı" width="500">


 ### **Etkileşimli Model Paneli**
<img src="https://github.com/user-attachments/assets/51466fef-a6bf-41b1-9264-a5cacf3de73d" alt="Bilim İnsanı Modeli" width="500">



### **Tanıtım Videosu**

https://github.com/user-attachments/assets/5f01a2ec-48f6-4ab6-8d67-770107a8f143



---

## **💾 Kurulum ve Kullanım**

1. **APK Dosyasını İndirin:**
   - Uygulamayı indirip cihazınıza yüklemek için [MathMagicAR](https://hmzaontdev.github.io/) web sitesini ziyaret edin, seçiminizi yapıp APK dosyasını indirin.
   - Kurduğunuzda `Bilinmeyen Kaynaklara İzin Ver!` uyarısı geldiğinde `İzin Ver` seçeneğini seçip kurulumu tamamlayın.

2. **Kullanım:**
   - Uygulamayı açın ve kamera erişimine izin verin.
   - Kullanıcı giriş ekranına **Kullanıcı Adı: `1` | Şifre: `1`** olacak şekilde giriş yapın.
   - Etrafınızda bulbildiğiniz düz yüzeye(masa üstü vb.) kameranızı doğrultun.
   - Bilim insanlarının modelleri ve bilgileri ekrana gelecektir.
   - **Yerleştir** butonuna basıp istediğiniz modele dokunup sürüklediğinizde kendisiyle alakalı hem sesli hem de görsel olarak bilgi verecektir.

---

## **📺 Proje Yapısı**

```
MathMagicAR
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── assets
│   │   │   │   ├── models
│   │   │   │   │   ├── MeryemMirzakhani.glb
│   │   │   │   │   ├── Archimedes.glb
│   │   │   │   │   ├── Brahmagupta.glb
│   │   │   │   │   ├── KatherineJhonson.glb
│   │   │   │   │   └── WilliamPlayfair.glb
│   │   │   ├── res
│   │   │   │   ├── raw
│   │   │   │   │   ├── meryem.mp3
│   │   │   │   │   ├── william.mp3
│   │   │   │   │   ├── katherine.mp3
│   │   │   │   │   ├── brahmagupta.mp3
│   │   │   │   │   └── archimedes.mp3
│   │  
├── README.md
└── LICENSE
```

---
