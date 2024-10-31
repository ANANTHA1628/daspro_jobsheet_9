import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang ingin diinput: ");
        int jumlahNilai = scanner.nextInt();
        int[] nilaiMahasiswa = new int[jumlahNilai];
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        double rataRata = (double) total / jumlahNilai;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\nDaftar nilai mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
