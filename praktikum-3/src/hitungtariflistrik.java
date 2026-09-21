import java.util.Scanner;

public class hitungtariflistrik {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Tarif listrik
            final int TARIF_450 = 500;
            final int TARIF_900 = 750;
            final int TARIF_1300 = 1000;
            final int TARIF_2200 = 1500;
            final int TARIF_DIATAS_2200 = 2000;

            System.out.print("Masukkan daya listrik (450, 900, 1300, 2200): ");
            int daya = input.nextInt();
            System.out.print("Masukkan pemakaian listrik (kWh): ");
            double kWh = input.nextDouble();

            // Mengecek kWh
            if (kWh <= 0) {
                System.out.println("Error: kWh harus lebih dari 0.");
                return;
            }
            int tarif = 0;
            String golongan = "";
            // Menentukan tarif berdasarkan daya
            if (daya == 450) {
                tarif = TARIF_450;
                golongan = "450 VA";
            } else if (daya == 900) {
                tarif = TARIF_900;
                golongan = "900 VA";
            } else if (daya == 1300) {
                tarif = TARIF_1300;
                golongan = "1300 VA";
            } else if (daya == 2200) {
                tarif = TARIF_2200;
                golongan = "2200 VA";
            } else if (daya > 2200) {
                tarif = TARIF_DIATAS_2200;
                golongan = "Di atas 2200 VA";
            } else {
                System.out.println("Error: Golongan daya tidak valid.");
                return;
            }

            // Menghitung total
            double total = kWh * tarif;
            // Menampilkan hasil
            System.out.println("\n===== TAGIHAN LISTRIK =====");
            System.out.println("Golongan Daya : " + golongan);
            System.out.println("Pemakaian     : " + kWh + " kWh");
            System.out.println("Tarif per kWh : Rp" + tarif);
            System.out.println("Total Tagihan : Rp" + total);
        }
}