import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuMakanan = {"Nasi Goreng", "Mie Goreng", "Kopi", "Teh", "Kue", "Jus Buah", "Ayam Goreng", "Burger"};

        System.out.println("Menu Makanan di Kafe:");
        for (String makanan : menuMakanan) {
            System.out.println("- " + makanan);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = false;
        for (String makanan : menuMakanan) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak ada di menu.");
        }
    }
}
