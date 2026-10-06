import java.util.Scanner;

public class latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    static int[] filterDiatasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > rataRata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > rataRata) {
                hasil[index] = data[i];
                index++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];
        System.out.println("masukkan 5 nilai: ");
        for ( int i = 0; i < data.length; i++) {
            System.out.print("nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;
        System.out.println("total = " + total);
        System.out.println("rata-rata = " + rataRata);
        int[] hasil = filterDiatasRataRata(data);
        System.out.println("nilai di atas rata-rata: ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}
