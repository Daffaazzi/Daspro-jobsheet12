package TugasJobsheet12;

import java.util.Scanner;
public class kubus08 {
    static int volume(int sisi){
        return sisi * sisi * sisi;
    }
    static int luasPermukaan(int sisi){
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;
        
        System.out.print("Masukkan panjang sisi Kubus: ");
        s = input.nextInt();

        L = luasPermukaan(s);
        System.out.println("Luas permukaan Kubus = " + L);

        vol = volume(s);
        System.out.println("Volume Kubus = " + vol);

        input.close();
    }
}
