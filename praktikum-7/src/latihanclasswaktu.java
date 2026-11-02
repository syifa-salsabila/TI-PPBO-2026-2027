public class latihanclasswaktu {
    public static void main(String[] args) {
        waktu w1 = new waktu(10, 30, 45);
        System.out.println("jam: " + w1.getJam());
        System.out.println("menit: " + w1.getMenit());
        System.out.println("detik: " + w1.getDetik());

        System.out.println("\npengujian validasi:");
        w1.setJam(25);
        w1.setMenit(70);
        w1.setDetik(80);
    }
}
