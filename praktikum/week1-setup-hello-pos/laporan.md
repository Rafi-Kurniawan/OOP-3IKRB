# Laporan Praktikum Minggu 1
Topik: "Paradigma dan Setup Proyek"

## Identitas
- Nama  : Rafi Kurniawan
- NIM   : 240202878
- Kelas : 3IKRB

---

## Tujuan
(Tuliskan tujuan praktikum minggu ini) 
"Memahami berbagai paradigma pemrograman"

---

## Dasar Teori
(Tuliskan ringkasan teori singkat (3–5 poin) yang mendasari praktikum)
1. Paradigma Pemrograman
   Paradigma pemrograman adalah cara berpikir atau pendekatan dalam menulis program komputer. Tiga paradigma utama yang dipelajari di praktikum ini adalah prosedural,
   berorientasi objek (OOP), dan fungsional. Masing-masing memiliki struktur dan logika kerja yang berbeda.
2. Paradigma Prosedural
   Paradigma ini berfokus pada urutan langkah-langkah atau prosedur (fungsi) untuk menyelesaikan suatu tugas. Program disusun dari perintah-perintah yang dijalankan secara
   berurutan dari atas ke bawah.
3. Paradigma Berorientasi Objek (OOP)
   OOP berfokus pada objek yang merepresentasikan entitas dunia nyata. Setiap objek memiliki atribut (data) dan metode (perilaku). Konsep utamanya meliputi kelas, objek,
   enkapsulasi, pewarisan, dan polimorfisme.
4. Paradigma Fungsional
   Paradigma ini menekankan pada penggunaan fungsi-fungsi murni tanpa efek samping dan menghindari perubahan data secara langsung. Biasanya menggunakan konsep seperti lambda
   expression, stream, dan operasi map-reduce.
5. Tujuan Praktikum Week 1
   Untuk memahami perbedaan antara ketiga paradigma pemrograman tersebut dengan membuat program sederhana “Hello POS World” menggunakan pendekatan prosedural, OOP, dan
   fungsional.
   
---

## Langkah Praktikum
(Tuliskan Langkah-langkah dalam prakrikum)
1. Menyiapkan lingkungan pemrograman (setup environment).  
2. Membuat struktur folder proyek.  
3. Membuat tiga program dengan paradigma berbeda.
4. Menuliskan dan menjalankan kode program.
5. Mengambil dan menyimpan hasil eksekusi.
6. Menyusun laporan praktikum.

---

## Kode Program
(Tuliskan kode utama yang dibuat)

```java
// Prosedural
   // HelloProcedural.java
   public class HelloProcedural {
      public static void main(String[] args) {
         String nim = "240202878";
         String nama = "Rafi Kurniawan";
         String[] produk = {"Beras", "Pupuk", "Benih"};
         int[] harga = {10000, 15000, 12000};
         int total = 0;

         System.out.println("Hello POS World");
         System.out.println("NIM: " + nim + ", Nama: " + nama);
         System.out.println("Daftar Produk:");

         for (int i = 0; i < produk.length; i++) {
            System.out.println("- " + produk[i] + ": " + harga[i]);
            total += harga[i];
         }

         System.out.println("Total harga semua produk: " + total);
      }
    }

// OOP
   // HelloOOP.java

// Kelas Produk merepresentasikan satu entitas "produk"
class Produk {
   String nama;
   int harga;

   // Konstruktor untuk membuat objek Produk baru
   Produk(String nama, int harga) {
      this.nama = nama;
      this.harga = harga;
   }
}

public class HelloOOP {
   public static void main(String[] args) {
      // Data identitas mahasiswa
      String nim = "240202878";
      String namaMhs = "Rafi Kurniawan";

      // Membuat array berisi beberapa objek Produk
      Produk[] daftar = {
         new Produk("Beras", 24000),
         new Produk("Pupuk", 66000),
         new Produk("Benih", 10000)
      };

      int total = 0;

      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
      System.out.println("Daftar Produk:");

      // Menampilkan semua produk menggunakan perulangan berbasis objek
      for (Produk p : daftar) {
         System.out.println("- " + p.nama + ": " + p.harga);
         total += p.harga;
      }

      System.out.println("Total harga semua produk: " + total);
   }
}

// Functional
   // HelloFunctional.java
import java.util.*;
import java.util.stream.*;

public class HelloFunctional {
   public static void main(String[] args) {
      String nim = "240202878";
      String nama = "Rafi Kurniawan";

      List<String> produk = Arrays.asList("Beras", "Pupuk", "Benih");
      List<Integer> harga = Arrays.asList(25000, 40000, 50000);

      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");

      // Menggunakan lambda dan stream untuk menampilkan produk & harga
      IntStream.range(0, produk.size())
         .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));

      // Menggunakan stream untuk menghitung total harga
      int total = harga.stream().mapToInt(Integer::intValue).sum();

      System.out.println("Total harga semua produk: " + total);
   }
}
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program) 
https://github.com/Rafi-Kurniawan/OOP-3IKRB/tree/main/praktikum/week1-setup-hello-pos/src/main/java/com/upb/agripos
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini).  
Praktikum ini membantu memahami perbedaan antara tiga paradigma pemrograman — yaitu prosedural, berorientasi objek (OOP), dan fungsional.

---

## Quiz
(1. Apakah OOP selalu lebih baik dari prosedural?  
   **Jawaban:**
   Tidak selalu. OOP tidak selalu lebih baik dari prosedural karena keduanya digunakan untuk kebutuhan yang berbeda.

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?   
   **Jawaban:**
   Functional programming digunakan saat program harus bebas efek samping (pure function), mudah diuji, dan mudah dijalankan secara paralel. Paradigma ini lebih efisien ketika
   bekerja dengan data besar, transformasi data berantai, atau pemrosesan paralel karena setiap fungsi berdiri sendiri tanpa mengubah keadaan global.  

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?  
   **Jawaban:**
   1. Prosedural
      Maintainability rendah karena kode disusun berdasarkan urutan langkah dan sering bergantung pada variabel global. Saat program tumbuh besar, perubahan satu bagian dapat
      memengaruhi bagian lain. Scalability juga rendah karena sulit menambah fitur tanpa mengubah struktur utama.

   2. OOP (Object-Oriented Programming)
      Maintainability tinggi karena struktur kode terorganisir melalui class dan objek. Setiap bagian memiliki tanggung jawab jelas, sehingga perubahan dapat dilakukan tanpa
      memengaruhi keseluruhan sistem. Scalability juga tinggi karena konsep inheritance dan polymorphism memungkinkan penambahan fitur baru tanpa mengubah kode lama.

   3. Fungsional
      Maintainability tinggi karena setiap fungsi bersifat independen dan tidak memiliki efek samping. Perubahan satu fungsi tidak memengaruhi fungsi lain. Scalability juga
      tinggi karena paradigma ini mendukung pemrosesan paralel dan komposisi fungsi yang efisien, sehingga mudah diperluas untuk menangani beban data yang lebih besar.

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
   **Jawaban:**
   1. Struktur berbasis objek
      Aplikasi POS memiliki entitas seperti produk, pelanggan, transaksi, dan kasir. Dalam OOP, setiap entitas dapat dibuat sebagai objek dengan atribut dan perilaku sendiri,        sehingga kode lebih terorganisir.

   2. Kemudahan pengembangan dan pemeliharaan
      OOP memungkinkan pemisahan tanggung jawab melalui class. Perubahan pada satu class tidak memengaruhi class lain, sehingga sistem mudah diperbarui atau diperluas tanpa
      mengubah keseluruhan program.

   3. Dukungan terhadap penggunaan ulang kode
      OOP mendukung konsep inheritance dan polymorphism yang memungkinkan penggunaan ulang kode. Misalnya, class produk dapat diturunkan menjadi produk makanan, minuman, atau
      pakaian tanpa menulis ulang logika utama.

   4. Skalabilitas tinggi
      OOP memudahkan penambahan fitur baru, seperti laporan penjualan, sistem diskon, atau integrasi pembayaran digital, tanpa mengganggu struktur program yang sudah ada.

   5. Keterhubungan antar komponen sistem
      Dalam aplikasi POS, objek dapat saling berinteraksi dengan jelas. Misalnya, objek transaksi dapat berhubungan dengan objek produk dan pelanggan secara teratur, sehingga
      sistem lebih konsisten dan mudah dipahami.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (boilerplate code)?
   **Jawaban:**
   Paradigma fungsional mengurangi kode berulang karena berfokus pada penggunaan fungsi murni, komposisi fungsi, dan ekspresi deklaratif untuk menggantikan pola kode yang
   berulang.
