public class pengeluaran {
    public int tanggal;
    public int bulan;
    public int tahun;
    public int pengeluaran;

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
}
