public class MethodDemo {
    //method void: tidak mengembalikan nilai apa pun
    static void sapa(String nama) {
        System.out.println("halo, " + nama + "!");
    }

    public static void main(String[] args){
        sapa("budi");
        sapa("siti");
    }
}
