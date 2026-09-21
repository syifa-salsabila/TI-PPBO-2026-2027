import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan umur: ");
        int umur = input.nextInt();
        System.out.print("apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();
        int harga;

        if (mahasiswa && umur < 25) {
            harga = 20000;
        } else {
            harga = 35000;
        }

        System.out.println("harga tiket: Rp" + harga);
    }
}
