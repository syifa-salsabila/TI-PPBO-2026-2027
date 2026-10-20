public class arraybuku {
    public static void main(String[] args) {
        buku[] daftarBuku = {
                new buku("laskar pelangi", "andrea hirata", 2005),
                new buku("bumi", "tere liye", 2014),
                new buku("hujan", "tere liye", 2016),
                new buku("pulang", "tere liye", 2018),
        };

        System.out.println("buku yang terbit setelah tahun 2015: ");

        for (int i=0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(daftarBuku[i].judul);
            }
        }
    }
}
