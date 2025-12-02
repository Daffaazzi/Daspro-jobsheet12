package TugasJobsheet12;

import java.util.Scanner;

public class NilaiMahasiswa08 {

    static void isianArray(int[] a){ 
        Scanner sc = new Scanner(System.in); 

        for(int i=0; i<a.length; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] a){
        System.out.println("\nDaftar Nilai:");

       
        for(int x : a){
            System.out.println(x);  
        }
    }

    static int hitTot(int[] a){
        int total = 0; 
        
        for(int x : a){
            total += x; 
        }
        return total; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int N = sc.nextInt();
        int[] nilai = new int[N];
        
        isianArray(nilai);
        tampilArray(nilai);

        int total = hitTot(nilai);
        System.out.println("Total nilai = " + total);
    }
}