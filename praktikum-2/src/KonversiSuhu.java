import java.util.Scanner;

public class KonversiSuhu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan suhu dalam satuan celcius: ");
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " derajat celcius sama dengan " + fahrenheit + " derajat fahrenheit");
    }
}
