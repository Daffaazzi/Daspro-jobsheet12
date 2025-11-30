import java.util.Scanner;

public class HitungBalok08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p, l, t, vol;

        System.out.println("Masukkan Panjang: ");
        p = input.nextInt();

        System.out.println("Masukkan Lebar: ");
        l = input.nextInt();

        System.out.println("Masukkan Tinggi: ");
        t = input.nextInt();

        l = p * l;
        System.out.println("Luas persegi panjang adalah" + l);
        vol = l * t;
        System.out.println("Volume balok adalah" + vol);

        input.close();



    }
}
