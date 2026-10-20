public class latihanClass {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa(); //membuat object
        m1.nama = "budi";
        m1.nim = "12345";
        m1.ipk = 3.75;

        mahasiswa m2= new mahasiswa();
        m2.nama = "siti";
        m2.nim = "67890";
        m2.ipk = 3.90;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
