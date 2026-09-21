import java.util.Scanner;

public class kalkulatorSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("operator (=, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("angka kedua: ");
        double b = sc.nextDouble();

        double hasil = 0;
        switch (op) {
            case '+': hasil = a + b; break;
            case '-': hasil = a - b; break;
            case '*': hasil = a * b; break;
            case '/': hasil = a / b; break;
            default: System.out.println("operator tidak dikenali");
        }
        System.out.println("hasil: " + hasil);
    }
}
