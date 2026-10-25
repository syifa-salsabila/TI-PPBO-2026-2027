public class produk1 {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    //construktor untuk mengisi data produk
    public produk1(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    //method untuk menghitung total harga
    public double hitungtotalharga1(int jumlahbeli) {
        return harga * jumlahbeli;
    }

    //method untuk mengurangi stok produk
    public void kurangistok1(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("pembelian berhasil");
            System.out.println("sisa stok " + namaProduk + ": " + stok);
        } else {
            System.out.println("stok tidak mencukupi");
        }
    }

    //method untuk menampilkan informasi produk
    public void tampilkandata1() {
        System.out.println("kode produk     : " + kodeProduk);
        System.out.println("nama produk     : " + namaProduk);
        System.out.println("harga           : Rp" + harga);
        System.out.println("stok            : " + stok);
    }
}
