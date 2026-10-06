public class latihan3 {
    static double konversiSuhu(double celcius) {
        return celcius + 273.15;
    }
    static double konversiSuhu(double celcius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celcius + 273.15;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("25 Celcius ke Kelvin = "
                + konversiSuhu(25));

        System.out.println("25 Celcius ke Fahrenheit = "
                + konversiSuhu(25, "Fahrenheit"));

        System.out.println("25 Celcius ke Kelvin = "
                + konversiSuhu(25, "Kelvin"));
    }
}
