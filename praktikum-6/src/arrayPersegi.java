public class arrayPersegi {
    public static void main(String[] args) {
        persegi[] daftarPersegi = {
                new persegi(3),
                new persegi(5),
                new persegi(7),
                new persegi(4)
        };

        double luasTerbesar = daftarPersegi[0].hitungluas();
        int indeksTerbesar = 0;

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungluas() > luasTerbesar) {
                luasTerbesar = daftarPersegi[i].hitungluas();
                indeksTerbesar = i;
            }
        }

        System.out.println("persegi dengan luas terbesar:");
        System.out.println("sisi: " + daftarPersegi[indeksTerbesar].sisi);
        System.out.println("luas: " + luasTerbesar);
    }
}
