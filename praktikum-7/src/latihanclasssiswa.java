public class latihanclasssiswa {
    public static void main(String[] args) {
        siswa s1 = new siswa(90);
        siswa s2 = new siswa(75);
        siswa s3 = new siswa(60);
        siswa s4 = new siswa(40);

        System.out.println("nilai siswa 1: " + s1.getNilai());
        System.out.println("nilai hurus: " + s1.getNilaiHuruf());

        System.out.println("nilai siswa 2: " + s2.getNilai());
        System.out.println("nilai hurus: " + s2.getNilaiHuruf());

        System.out.println("nilai siswa 3: " + s3.getNilai());
        System.out.println("nilai hurus: " + s3.getNilaiHuruf());

        System.out.println("nilai siswa 4: " + s4.getNilai());
        System.out.println("nilai hurus: " + s4.getNilaiHuruf());

        System.out.println("\npengujian validasi: ");
        s1.setNilai(120);
    }
}