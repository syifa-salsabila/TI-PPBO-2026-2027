public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank("001", "budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Andi", 200000, "Giro");

        System.out.println("===REKENING BUDI===");
        rek1.setor(50000);
        rek1.tarik(30000);

        System.out.println("\n===REKENING ANDI===");
        rek2.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n===TRANSFER BERHASIL===");
        rek1.transferke(rek2, 50000);

        System.out.println("\n===TRANSFER GAGAL===");
        rek1.transferke(rek2, 500000);

        System.out.println("\n===JUMLAH TRANSFER TIDAK VALID===");
        rek1.transferke(rek2, -10000);

        System.out.println("\n===MUTASI AKHIR===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
