// Program Fibonacci
import java.util.Scanner; // Mengimpor kelas Scanner untuk input

public class Fibonacci {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah bilangan bulat positif
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        int n = input.nextInt(); // Membaca bilangan bulat

        // Memeriksa apakah bilangan valid atau tidak
        if (n < 0) {
            System.out.println("Bilangan harus positif");
            return; // Mengakhiri program jika tidak valid
        }

        // Membuat array untuk menyimpan deret Fibonacci
        int[] fibonacci = new int[n + 1]; // Array berukuran n + 1

        // Mengisi array dengan deret Fibonacci
        fibonacci[0] = 0; // Elemen pertama adalah 0
        fibonacci[1] = 1; // Elemen kedua adalah 1
        for (int i = 2; i <= n; i++) { // Mulai dari elemen ketiga
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Setiap elemen adalah jumlah dari dua elemen sebelumnya
        }

        // Mencetak deret Fibonacci
        System.out.println("Deret Fibonacci hingga " + n + " adalah:");
        for (int i = 0; i <= n; i++) { // Mengulangi semua elemen array
            System.out.print(fibonacci[i] + " "); // Mencetak elemen array
        }
    }
}
