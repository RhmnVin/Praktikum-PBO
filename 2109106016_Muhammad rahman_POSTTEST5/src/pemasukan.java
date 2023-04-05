import java.lang.reflect.Array;
import java.util.function.Function;

public abstract class pemasukan {
    private int tanggal;
    private int bulan;
    private int tahun;
    private int uang_masuk;
    private int uang_sekarang;

    public abstract  void edit();

    public pemasukan(int uang_masuk,int uang_sekarang,int tanggal,int bulan,int tahun){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = uang_masuk;
        this.uang_masuk = uang_masuk;
        this.uang_sekarang = uang_sekarang;
    }
    public pemasukan(){

    }
    public int getTanggal() {
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
    public int getUang_masuk() {
        return uang_masuk;
    }
    public void setUang_masuk(int uang_masuk) {
        this.uang_masuk = uang_masuk;
    }
    public int getUang_sekarang() {
        return uang_sekarang;
    }
    public void setUang_sekarang(int uang_sekarang) {
        this.uang_sekarang = uang_sekarang;
    }



}
