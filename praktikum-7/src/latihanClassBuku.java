public class latihanClassBuku {
    public static void main (String[] args) {
        buku b1 = new buku("Laskar pelangi", "andrea hirata", 2005);

        System.out.println("judul: " + b1.getJudul());
        System.out.println("pengarang: " + b1.getPengarang());
        System.out.println("tahun terbit: " + b1.getTahunTerbit());

        b1.setJudul("Bumi");
        b1.setPengarang("Tere Liye");

        System.out.println("Setelah diubah:");
        System.out.println("judul: " + b1.getJudul());
        System.out.println("pengarang: " + b1.getPengarang());
        System.out.println("tahun terbit: " + b1.getTahunTerbit());
    }
}
