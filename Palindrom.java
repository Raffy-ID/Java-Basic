// Program Palindrom
import java.util.Scanner; // Mengimpor kelas Scanner untuk input

public class Palindrom {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah kata atau kalimat
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String teks = input.nextLine(); // Membaca teks

        // Memeriksa apakah teks adalah palindrom atau tidak dengan memanggil fungsi isPalindrom
        boolean palindrom = isPalindrom(teks); // Menyimpan hasil fungsi dalam variabel boolean

        // Mencetak hasil pemeriksaan
        if (palindrom) { // Jika palindrom adalah true, maka teks adalah palindrom
            System.out.println("Teks \"" + teks + "\" adalah palindrom");
        } else { // Jika palindrom adalah false, maka teks bukan palindrom
            System.out.println("Teks \"" + teks + "\" bukan palindrom");
        }
    }

    // Fungsi untuk memeriksa apakah sebuah teks adalah palindrom atau tidak
    public static boolean isPalindrom(String teks) {
        teks = teks.toLowerCase(); // Mengubah semua huruf menjadi huruf kecil
        teks = teks.replaceAll("\\s+", ""); // Menghapus semua spasi

        int panjang = teks.length(); // Menyimpan panjang teks dalam variabel

        for (int i = 0; i < panjang / 2; i++) { // Mengulangi setengah dari panjang teks
            char depan = teks.charAt(i); // Menyimpan karakter di posisi i dalam variabel depan
            char belakang = teks.charAt(panjang - i - 1); // Menyimpan karakter di posisi terbalik dalam variabel belakang

                        if (depan != belakang) {
                // Jika karakter di depan dan karakter di belakang tidak sama, maka teks bukan palindrom
                return false;
            }
        }

        // Jika semua karakter cocok satu sama lain, maka teks adalah palindrom
        return true;
    }
}      
