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
