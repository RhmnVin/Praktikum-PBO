public class pemasukan_bulanan implements pemasukan {
    private static int tanggal;
    private static int bulan;
    private static int tahun;
    private static int uang_masuk;
    private static int uang_sekarang;

    public pemasukan_bulanan(int tanggal,int bulan,int tahun,int uang_masuk,int uang_sekarang){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.uang_masuk = uang_masuk;
        this.uang_sekarang = uang_sekarang;
    }
    public pemasukan_bulanan(){}
    public  void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    public  void setBulan(int bulan) {
        this.bulan = bulan;
    }
    public  void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public  void setUang_masuk(int uang_masuk) {
        this.uang_masuk = uang_masuk;
    }
    public  void setUang_sekarang(int uang_sekarang) {
        this.uang_sekarang = uang_sekarang;
    }
    public int getBulan() {
        return bulan;
    }
    public int getTahun() {
        return tahun;
    }
    public int getTanggal() {
        return tanggal;
    }
    public int getUang_masuk() {
        return uang_masuk;
    }
    public int getUang_sekarang() {
        return uang_sekarang;
    }

    public  void edit() {
        System.out.println("berhasil mengubah data pemasukan bulanan ");}
    public  void tambah(){
        System.out.println("telah berhasil menambah data pemasukan bulanan");
    }

}
