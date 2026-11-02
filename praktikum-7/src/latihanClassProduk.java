public class latihanClassProduk {
    public static void main(String[] args) {
        produk p1 = new produk("P001", "lip balm", 25000, 20);

        System.out.println("kode produk: " + p1.getKodeProduk());
        System.out.println("nama produk: " + p1.getNamaProduk());
        System.out.println("harga: " + p1.getHarga());
        System.out.println("stok awal: " + p1.getStok());

        System.out.println("\nmenambah stok:");
        p1.tambahStok(10);
        System.out.println("stok sekarang: " + p1.getStok());

        System.out.println("\nmengurangi stok:");
        p1.kurangiStok(5);
        System.out.println("stok sekarang: " + p1.getStok());

        System.out.println("\npengujian validasi:");
        p1.setHarga(-5000);
        p1.kurangiStok(100);
    }
}
