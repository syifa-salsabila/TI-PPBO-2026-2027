import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        //menghitung dan menampilkan luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        System.out.println("luas persegi panjang = " + luasPersegiPanjang);
        //menghitung dan menampilkan keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("keliling persegi panjang = " + kelilingPersegiPanjang);

        System.out.print("masukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        //menghitung dan menampilkan luas lingkaran
        double luaslingkaran = Math.PI * jarijari * jarijari;
        System.out.println("luas lingkaran = " + luaslingkaran);
        //menghitung dan menampilkan keliling lingkaran
        double kelilinglingkaran = 2 * Math.PI * jarijari;
        System.out.println("keliling lingkaran = " + kelilinglingkaran);

        //menyimpan hasil perbandingan luas persegi panjang
        boolean luasBesar = luasPersegiPanjang > 100;
        //menampilkan nilai boolean
        System.out.println("apakah luas persegi panjang lebih dari 100? " + luasBesar);
    }
}
