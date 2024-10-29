import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan lima nomor ID
        System.out.println("Masukkan lima nomor ID (tiga digit, pisahkan dengan spasi):");
        String input = scanner.nextLine(); // Membaca input dari pengguna
        String[] nomorIDs = input.split(" "); // Memisahkan nomor ID berdasarkan spasi

        // Memeriksa setiap nomor ID
        for (String nomorID : nomorIDs) {
            if (validasiNomorID(nomorID)) {
                System.out.println(nomorID + " valid"); // Jika valid, tampilkan "valid"
            } else {
                System.out.println(nomorID + " tidak valid"); // Jika tidak valid, tampilkan "tidak valid"
            }
        }

        scanner.close(); // Tutup scanner
    }

    // Fungsi untuk memvalidasi nomor ID
    public static boolean validasiNomorID(String nomorID) {
        // Cek apakah panjang nomor ID adalah 3
        if (nomorID.length() != 3) {
            return false; // Jika tidak 3 digit, kembalikan false (tidak valid)
        }

        // Mengambil digit dari nomor ID
        int d1 = nomorID.charAt(0) - '0'; // Digit pertama
        int d2 = nomorID.charAt(1) - '0'; // Digit kedua
        int d3 = nomorID.charAt(2) - '0'; // Digit ketiga

        // Cek apakah semua digit berbeda
        if (d1 == d2 || d1 == d3 || d2 == d3) {
            return false; // Jika ada yang sama, kembalikan false
        }

        // Cek urutan digit
        if (d1 > d2 || d2 > d3) {
            return false; // Jika urutannya salah, kembalikan false
        }

        // Cek apakah digit ketiga adalah bilangan ganjil
        if (d3 % 2 == 0) {
            return false; // Jika digit ketiga genap, kembalikan false
        }

        return true; // Jika semua syarat terpenuhi, kembalikan true (valid)
    }
}