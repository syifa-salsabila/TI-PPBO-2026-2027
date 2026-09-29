import java.util.Scanner;

public class latihan6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();
        int[] angka = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("array sebelum diurutkan: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }
        for (int i = 0; i < jumlah -1; i++){
            for (int j = 0; j < jumlah -1 -i; j++){
                if (angka[j] > angka[j + 1]){
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        System.out.println("\narray setelah diurutkan: ");
        for (int i = 0; i < jumlah; i++){
            System.out.print(angka[i] + " ");
        }
    }
}