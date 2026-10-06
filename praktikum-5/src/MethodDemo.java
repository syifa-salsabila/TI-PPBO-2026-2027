public class MethodDemo {
    //method void: tidak mengembalikan nilai apa pun
    static void tampilkanbiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota );
    }

    public static void main(String[] args){
        tampilkanbiodata("budi", 20, "bandung");
    }
}
