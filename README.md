Berikut adalah kerangka dan fungsinya:

**Folder / File**,Deskripsi
**src/main/java/pages/,Page Object Model (POM)**; menyimpan elemen UI dan aksi pada halaman web.
**src/test/java/stepDefinitions/**,Implementasi logika teknis dari tiap baris Gherkin (.feature).
**src/test/java/hooks/**,Pengaturan Setup (buka browser) dan Teardown (tutup browser).
**src/test/java/runner/**,Jembatan untuk menjalankan tes Cucumber menggunakan TestNG.
**src/test/resources/features/**,Skenario pengujian dalam bahasa manusia (Gherkin format).
**build.gradle**,"Manajemen dependensi (Selenium, Cucumber, TestNG)."
**testng.xml**,Konfigurasi urutan dan grup pengujian yang akan dijalankan.

**Language: Java

Automation: Selenium WebDriver

Framework: TestNG

BDD: Cucumber

Build Tool: Gradle**

**Run di terminal / run testng.xml
**
agar run testing pada web tidak terlalu cepat harusnya bisa tambahkan :
try {
            Thread.sleep(5000); // atau lebih sesuai kebutuhan
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

note : pada tugas hanya minta 3 test case, namun disini dibuat 4 test case yang telah mencakup semuanya
