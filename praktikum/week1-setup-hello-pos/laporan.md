# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Rafi Kurniawan
- NIM   : 240202878
- Kelas : 3IKRB

---

## Tujuan
(Tuliskan tujuan praktikum minggu ini.  
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
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
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
Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.

---

## Quiz
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
