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
