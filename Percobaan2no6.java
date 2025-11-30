public class Percobaan2no6 {

    static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==========================");
    System.out.println("Silahkan Pilih Menu yang Annda inginkan");

    if (isMember) {
            System.out.println("Status Member: YA");
        } else {
            System.out.println("Status Member: TIDAK");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo: Diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("=====================\n");
    }
    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
        Menu("Budi", true, "DISKON30"); // jikanamanya adalah budi

    }
}