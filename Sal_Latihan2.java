import java.util.Scanner;

public class Sal_Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berapa banyak angka yang ingin di hitung rata ratanya:");
        int jumlahAngka = input.nextInt();

        //Inisialisasi variabel untuk menyimpan jumlah total
        int total = 0;

        //Meminta pengguna memasukkan angka-angka
        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            int angka = input.nextInt();
            total += angka;

        }

        //Menghitung rata rata
        double rataRata = (double) total / jumlahAngka;

        //Menampilkan rata-rata
        System.out.println("Rata-rata dari " + jumlahAngka + " angka adalah " + rataRata);

        //Tutup Scanner
        input.close();
    }
}
