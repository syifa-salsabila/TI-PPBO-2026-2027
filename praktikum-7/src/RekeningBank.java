public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }
    public String getPemilik() {
        return pemilik;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    public void transferke(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer gagal! jumlah tidak valid");
        } else if (tujuan == null || tujuan == this) {
            System.out.println("transfer gagal! rekening tujuan tidak valid");
        } else if (jumlah > saldo) {
            System.out.println("transfer gagal! saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer berhasil");
        }
    }

    public void cetakMutasi() {
        System.out.println("==============================");
        System.out.println("        MUTASI REKENING");
        System.out.println("==============================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat Ini : Rp" + saldo);
        System.out.println("==============================");
    }
}