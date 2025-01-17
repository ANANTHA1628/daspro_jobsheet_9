import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 


        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];


        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = scanner.nextInt();
            scanner.nextLine(); 
        }


        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }


        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("- " + namaPesanan[i] + ": Rp" + hargaPesanan[i]);
        }
        System.out.println("\nTotal Biaya: Rp" + totalBiaya);
    }
}
