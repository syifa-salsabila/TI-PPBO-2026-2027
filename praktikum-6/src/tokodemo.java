public class tokodemo {
    public static void main(String[] args) {

        // membuat array berisi 5 objek produk
        produk1[] daftarproduk = {
                new produk1("P001", "buku", 15000, 20),
                new produk1("P002", "pensil", 3000, 30),
                new produk1("P003", "tas", 120000, 5),
                new produk1("P004", "sepatu", 250000, 3),
                new produk1("P005", "pulpen", 5000, 25),
        };

        //menampilkan seluruh data produk
        System.out.println("=== DAFTAR PRODUK ===");
        for (int i = 0; i < daftarproduk.length; i++) {
            daftarproduk[i].tampilkandata1();
        }

        //simulasi pembelian produk pertama
        System.out.println("===SIMULASI PEMBELIAN===");
        int jumlahbeli1 = 2;
        System.out.println("produk: " + daftarproduk[0].namaProduk);
        System.out.println("jumlah beli: " + jumlahbeli1);
        System.out.println("total harga: Rp" + daftarproduk[0].hitungtotalharga1(jumlahbeli1));
        daftarproduk[0].kurangistok1(jumlahbeli1);

        //simulasi pembelian produk kedua dengan stok tidak mencukupi
        System.out.println("===SIMULASI STOK TIDAK CUKUP===");
        int jumlahbeli2 = 10;
        System.out.println("produk: " + daftarproduk[3].namaProduk);
        System.out.println("jumlah beli: " + jumlahbeli2);
        System.out.println("total harga: Rp" + daftarproduk[3].hitungtotalharga1(jumlahbeli2));
        daftarproduk[3].kurangistok1(jumlahbeli2);

        //mencari harga termahal
        System.out.println("===PRODUK TERMAHAL===");
        produk1 termahal = daftarproduk[0];
        for (int i = 1; i < daftarproduk.length; i++) {
            if (daftarproduk[i].harga > termahal.harga) {
                termahal = daftarproduk[i];
            }
        }
        termahal.tampilkandata1();
    }
}
