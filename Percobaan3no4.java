import java.util.Scanner;

public class Percobaan3no4 {
    static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("==========================");
    }
    static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo DISKON50 → Diskon 50%");
            totalHarga = totalHarga / 2; 
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo DISKON30 → Diskon 30%");
            totalHarga = totalHarga - (totalHarga * 30 / 100); 
        } else {
            System.out.println("Kode promo invalid → tidak ada diskon");
        }

        return totalHarga; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu(); 
        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;  
        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\n=== Pesanan Menu ke-" + i + " ===");
            
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (atau '-' jika tidak ada): ");
            String kodePromo = sc.next();

            int totalPerMenu = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Subtotal pesanan menu ke-" + i + ": Rp " + totalPerMenu);

            totalKeseluruhan += totalPerMenu;
        }

        System.out.println("\n======================================");
        System.out.println("TOTAL KESELURUHAN SEMUA PESANAN: Rp " + totalKeseluruhan);
    }
}