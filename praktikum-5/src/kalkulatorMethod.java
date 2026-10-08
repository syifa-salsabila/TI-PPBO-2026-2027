import java.util.Scanner;

public class kalkulatorMethod {
    //method tambah 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }
    //method tambah 3 angka(overloading)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    //method kurang
    static double kurang(double a, double b) {
        return a - b;
    }
    //method kali
    static double kali(double a, double b) {
        return a * b;
    }
    //method bagi
    static double bagi(double a, double b) {
        return a / b;
    }
    //method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a,b);
    }
    //method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }
    //method mencari nilai maksimum
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double max = riwayatHasil[0];
        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] riwayatHasil = new double[100];
        int jumlahHasil = 0;
        int pilihan;

        do{
            System.out.println("=== KALKULATOR ===");
            System.out.println("1. tambah 2 angka");
            System.out.println("2. tambah 3 angka");
            System.out.println("3. kurang");
            System.out.println("4. kali");
            System.out.println("5. bagi");
            System.out.println("6. pangkat");
            System.out.println("7. akar kuadrat");
            System.out.println("8. keluar");

            System.out.print("pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("masukkan angka pertama: ");
                    double a = input.nextInt();
                    System.out.print("masukkan angka kedua: ");
                    double b = input.nextInt();
                    double hasil = tambah(a, b);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 2:
                    System.out.print("masukkan angka pertama: ");
                    double x = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    double y = input.nextDouble();
                    System.out.print("masukkan angka ketiga: ");
                    double z = input.nextDouble();
                    hasil = tambah(x, y, z);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 3:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = kurang(a, b);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 4:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = kali(a, b);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 5:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = bagi(a, b);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 6:
                    System.out.print("masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("masukkan angka kedua: ");
                    b = input.nextDouble();
                    hasil = pangkat(a, b);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 7:
                    System.out.print("masukkan angka: ");
                    a = input.nextDouble();
                    hasil = akarKuadrat(a);
                    System.out.println("hasil = " + hasil);
                    riwayatHasil[jumlahHasil] = hasil;
                    jumlahHasil++;
                    break;

                case 8:
                    System.out.println("Program selesai.");
                    if (jumlahHasil > 0) {
                        double maksimum = riwayatKeMaksimum(riwayatHasil);
                        System.out.println("Nilai maksimum = " + maksimum);
                    }
                    break;

                default:
                    System.out.println("pilihan tidak tersedia.");
            }
        } while (pilihan != 8);
        input.close();
    }
}
