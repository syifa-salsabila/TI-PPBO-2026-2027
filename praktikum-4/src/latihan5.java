import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah data: ");
        int jumlah = input.nextInt();
        int[] angka = new int[jumlah];
        for (int i = 0; i < jumlah; i++){
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        int terbesar = angka[0];
        int terbesarkedua = Integer.MIN_VALUE;

        for (int i = 1; i < jumlah; i++) {
            if (angka[i] > terbesar) {
                terbesarkedua = terbesar;
                terbesar = angka[i];
            }else if (angka[i] > terbesarkedua && angka[i] != terbesar) {
                terbesarkedua = angka[i];
            }
        }
        System.out.println("nilai terbesar = " + terbesar);
        System.out.println("nilai terbesar kedua = " + terbesarkedua);
    }
}
