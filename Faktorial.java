// Program Faktorial
import java.util.Scanner; // Mengimpor kelas Scanner untuk input

public class Faktorial {
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

        // Menghitung faktorial dengan menggunakan perulangan for
        int faktorial = 1; // Variabel untuk menyimpan hasil faktorial
        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i; // Mengalikan faktorial dengan i
        }

        // Mencetak hasil faktorial dengan menggunakan perulangan
        System.out.println("Faktorial dari " + n + " dengan menggunakan perulangan adalah " + faktorial);

        // Menghitung faktorial dengan menggunakan rekursi
        faktorial = hitungFaktorial(n); // Memanggil fungsi rekursif

        // Mencetak hasil faktorial dengan menggunakan rekursi
        System.out.println("Faktorial dari " + n + " dengan menggunakan rekursi adalah " + faktorial);
    }

    // Fungsi rekursif untuk menghitung faktorial dari sebuah bilangan
    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) { // Kasus dasar: jika n adalah 0 atau 1, maka faktorialnya adalah 1
            return 1;
        } else { // Kasus rekursif: jika n lebih besar dari 1, maka faktorialnya adalah n dikali dengan faktorial dari n-1
            return n * hitungFaktorial(n - 1);
        }
    }
}
