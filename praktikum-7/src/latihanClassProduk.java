public class latihanClassProduk {
    public static void main(String[] args) {
        produk p1 = new produk("Laptop", 8000000);
        produk p2 = new produk("mouse", 150000);

        double batasHarga = 1000000;

        System.out.println("Produk: " + p1.namaProduk);
        System.out.println("harga: " + p1.harga);
        System.out.println("mahal: " + p1.isMahal(batasHarga));
        System.out.println("---");

        System.out.println("Produk: " + p2.namaProduk);
        System.out.println("harga: " + p2.harga);
        System.out.println("mahal: " + p2.isMahal(batasHarga));
    }
}
