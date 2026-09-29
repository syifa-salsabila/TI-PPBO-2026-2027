import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int [3][3];
        System.out.println("masukkan elemen matriks 3x3: ");
        for(int baris = 0; baris < 3; baris++){
            for(int kolom = 0; kolom < 3; kolom++){
                System.out.println("baris " + (baris + 1) + ",kolom " + (kolom + 1) + ": ");
                matriks[baris][kolom] = input.nextInt();
            }
        }
        System.out.println("matriks: ");
        for(int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }
        int totalmatriks = 0;
        System.out.println("jumlah setiap baris: ");
        for (int baris = 0; baris < 3; baris++){
            int totalbaris = 0;
            for (int kolom = 0; kolom < 3; kolom++) {
                totalbaris += matriks[baris][kolom];
            }
            System.out.println("Baris " + (baris + 1) + "=" + totalbaris);
            totalmatriks += totalbaris;
        }
        System.out.println("total seluruh elemen = " + totalmatriks);
    }
}
