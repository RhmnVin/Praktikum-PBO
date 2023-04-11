import java.lang.reflect.Array;
import java.util.function.Function;

public interface  pemasukan {

    public void edit();
    public void tambah();
    public  int getTanggal();
    public static void setTanggal(int tanggal){};
    public static void setBulan(int bulan){};
    public static void setTahun(int tahun){};
    public static void setUang_masuk(int uang_masuk){};
    public static void setUang_sekarang(int uang_sekarang){};
    public  int getBulan();
    public int getTahun();
    public int getUang_masuk();
    public int getUang_sekarang();

}
