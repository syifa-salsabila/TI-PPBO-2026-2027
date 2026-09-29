import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi/ukuran: ");
        int ukuran = input.nextInt();

        System.out.println("\nSegitiga terbalik:");
        for (int i = ukuran; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPersegi: ");
        for(int i = 1; i <= ukuran; i++){
            for (int j = 1; j <= ukuran; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
