import java.util.Scanner;

public class HitungNilaiAkhir {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai UTS
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        // Meminta pengguna memasukkan nilai UAS
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Meminta pengguna memasukkan nilai tugas
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        // Bobot nilai UTS, UAS, dan tugas (dalam persentase)
        double bobotUTS = 0.30;
        double bobotUAS = 0.40;
        double bobotTugas = 0.30;

        // Menghitung nilai akhir
        double nilaiAkhir = (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS) + (nilaiTugas * bobotTugas);

        // Menampilkan nilai akhir
        System.out.println("Nilai Akhir Mahasiswa: " + nilaiAkhir);

        // Memberikan nilai berdasarkan kriteria
        if (nilaiAkhir >= 80) {
            System.out.println("Nilai: A");
        } else if (nilaiAkhir >= 70) {
            System.out.println("Nilai: B");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Nilai: C");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Nilai: D");
        } else {
            System.out.println("Nilai: E");
        }
    }
}
