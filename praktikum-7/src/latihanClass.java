public class latihanClass {
    public static void main(String[] args) {
        mahasiswa m1= new mahasiswa("budi", "111", 3.5);
        m1.ipk = 9.9; // seharusnya tidak masuk akal, ipk maksimal 4.0
        m1.nim = ""; //NIM kosong, seharusnya tidak valid
        System.out.println(m1.ipk); //program tetap 'menerima' nilai yang salah
    }
}
