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

    public mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama; //this.nama = atribut, nama = parameter
        this.nim = nim;
        this.ipk = ipk;
    }
}
