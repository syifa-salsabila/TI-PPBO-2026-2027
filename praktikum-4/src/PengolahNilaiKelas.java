import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input jumlah mahasiswa
        System.out.print("masukkan jumlah  mahasiswa: ");
        int N = input.nextInt();
        //array untuk menyimpan nilai
        double[] nilai = new double[N];
        //input nilai mahasiswa
        System.out.println("=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < N; i++){
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ":");
            nilai[i] = input.nextDouble();
        }

        //menampilkan nilai sebelum diurutkan
        System.out.println("=== NILAI SEBELUM DIURUTKAN ===");
        for (int i = 0; i < N; i++){
            System.out.print(nilai[i] + " ");
        }

        //inisialisasi nilai maksimum dan minimum
        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        //menghitung rata-rata, max, min, lulus dan tidak lulus
        for(int i = 0; i < N; i++){
            total += nilai[i];
            if(nilai[i] > nilaiTertinggi){
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah){
                nilaiTerendah = nilai[i];
            }
            if (nilai[i] >= 70){
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        double ratarata = total /N;

        //sorting ascending menggunakan bubble sort
        for (int i = 0; i < N - 1; i++){
            for (int j = 0; j < N - 1; j++){
                if (nilai[j] > nilai[j + 1]){
                    double temp = nilai[j];
                    nilai[j] = nilai [j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        //menampilkan nilai setelah diurutkan
        System.out.println("\n=== Nilai SETELAH DIURUTKAN ===");
        for (int i = 0; i < N; i++){
            System.out.println(nilai[i] + " ");
        }

        //menampilkan
        System.out.println("===============================");
        System.out.println(" LAPORAN NILAI KELAS ");
        System.out.println("===============================");
        System.out.printf("rata-rata nilai : %.2f%n", ratarata);
        System.out.println("nilai tertinggi : " + nilaiTertinggi);
        System.out.println("nilai terendah : " + nilaiTerendah);
        System.out.println("jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        System.out.println("===============================");

        input.close();
    }
}
