public class produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public produk(String kodeProduk, String namaproduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaproduk;
        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("harga tidak boleh negatif");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah >= 0) {
            stok += jumlah;
        } else {
            System.out.println("jumlah harus positif");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("stok tidak mencukupi");
        }
    }
}