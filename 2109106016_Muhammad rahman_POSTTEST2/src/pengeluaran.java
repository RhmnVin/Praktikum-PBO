public class pengeluaran {
    // public int tanggal;
    // public int bulan;
    // public int tahun;
    // public int pengeluaran;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int pengeluaran;
    public pengeluaran(int tgl,int bln,int thn,int pengeluaran){
        this.tanggal= tgl;
        this.bulan = bln;
        this.tahun = thn;
        this.pengeluaran = pengeluaran;

    }
    public pengeluaran(){}

    public static void edit(){
        System.out.println("berhasil mengubah data pengeluaran");
    }
    
    public int getTanggal(){
        return tanggal;
    }
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    public int getBulan() {
        return bulan;
    }
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public int getPengeluaran() {
        return pengeluaran;
    }
    public void setPengeluaran(int pengeluaran) {
        this.pengeluaran = pengeluaran;}
}
