import java.util.Scanner;

public class bilanganterbesar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("masukkan bilangan kedua: ");
        int b = input.nextInt();
        System.out.print("masukkan bilangan ketiga: ");
        int c = input.nextInt();

        if (a>b){
            if (a > c) {
                System.out.println("bilangan terbesar: " + a);
            } else {
                System.out.println("bilangan terbesar: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("bilangan terbesar: " + b);
            } else {
                System.out.println("bilangan terbesar: " + c);
            }
        }
    }
}
