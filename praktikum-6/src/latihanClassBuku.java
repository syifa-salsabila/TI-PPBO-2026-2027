public class latihanClassBuku {
    public static void main (String[] args) {
        buku b1 = new buku("Laskar pelangi", "andrea hirata", 2005);
        buku b2 = new buku("bumi", "Tere Liye", 2014);

        System.out.println("judul: " + b1.judul);
        System.out.println("pengarang: " + b1.pengarang);
        System.out.println("tahun terbit: " + b1.tahunTerbit);
        System.out.println("---");

        System.out.println("judul: " + b2.judul);
        System.out.println("pengarang: " + b2.pengarang);
        System.out.println("tahun terbit: " + b2.tahunTerbit);
    }
}
