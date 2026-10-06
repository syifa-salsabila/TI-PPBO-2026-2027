import java.util.Scanner;

public class latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        System.out.println("Masukkan 5 nilai ujian:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("Nilai minimum = "
                + cariNilaiMinimum(nilai));
        System.out.println("Nilai maksimum = "
                + cariNilaiMaksimum(nilai));
    }
}
