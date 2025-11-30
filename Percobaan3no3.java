import java.util.Scanner;
public class Percobaan3no3 {

    static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan Pilih Menu yang Anda inginkan");
    }


    static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {// === Fungsi yang diminta pada nomor 3 === //

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        // total awal harga sebelum diskon
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        // Diskon pada nomor3 
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%");
            totalHarga = totalHarga / 2; // potong 50%
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%");
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid");
            // totalHarga tetap, tanpa perubahan
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();

        System.out.print("\nMasukkan nomor menu: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item: ");
        int banyakItem = sc.nextInt();

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga setelah promo: " + totalHarga);
    }
}