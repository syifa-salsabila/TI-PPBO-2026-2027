import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("hasil operasi: ");
        System.out.println("penjumlahan(+) = " + (a + b));
        System.out.println("pengurangan(-)= " + (a - b));
        System.out.println("perkalian(*)= " + (a * b));
        System.out.println("pembagian(/)= " + (a / b));
        System.out.println("sisa bagi(%)= " + (a % b));

        System.out.println("hasil perbandingan: ");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " = " + (a == b));
    }
}
