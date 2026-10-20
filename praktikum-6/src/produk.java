public class produk {
    String namaProduk;
    double harga;

    public produk(String namaproduk, double harga) {
        this.namaProduk = namaproduk;
        this.harga = harga;
    }

    boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
