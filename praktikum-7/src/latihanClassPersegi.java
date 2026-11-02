public class latihanClassPersegi {
    public static void main(String[] args) {
        persegi p1 = new persegi(4);
        persegi p2 = new persegi(6);
        persegi p3 = new persegi(8);

        System.out.println("luas: " + p1.hitungluas());
        System.out.println("keliling: " + p1.hitungkeliling());
        System.out.println("---");

        System.out.println("luas: " + p2.hitungluas());
        System.out.println("keliling: " + p2.hitungkeliling());
        System.out.println("---");

        System.out.println("luas: " + p3.hitungluas());
        System.out.println("keliling: " + p3.hitungkeliling());
        System.out.println("---");
    }
}
