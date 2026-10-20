public class latihanClass {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa(); //membuat object
        m1.nama = "budi";
        m1.nim = "12345";
        m1.ipk = 3.75;

        System.out.println("nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);
        System.out.println("IPK: " + m1.ipk);
    }
}
