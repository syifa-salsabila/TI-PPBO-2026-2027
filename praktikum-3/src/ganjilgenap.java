import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0){
            System.out.println("bilangan genap");
        } else {
            System.out.println("bilangan ganjil");
        }
    }
}
