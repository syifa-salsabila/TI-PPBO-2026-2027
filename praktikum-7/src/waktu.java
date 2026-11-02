public class waktu {
    private int jam;
    private int menit;
    private int detik;

    public waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }
    public int getJam() {
        return jam;
    }
    public int getMenit() {
        return menit;
    }
    public int getDetik() {
        return detik;
    }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 59) {
            this.jam = jam;
        } else {
            System.out.println("jam tidak valid!");
        }
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("menit tidak valid!");
        }
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("detik tidak valid!");
        }
    }
}
