public class buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
