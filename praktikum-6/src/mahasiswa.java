public class mahasiswa {
    String nama;
    String nim;
    double ipk;

    //constructor default (tanpa parameter)
    public mahasiswa() {
        nama = "belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    public mahasiswa(String namaAwal, String nimAwal, double ipkAwal) {
        nama = namaAwal;
        nim = nimAwal;
        ipk = ipkAwal;
    }
}
