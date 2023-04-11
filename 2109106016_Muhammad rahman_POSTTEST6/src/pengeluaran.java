import java.lang.reflect.Array;

public abstract class pengeluaran {
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
    
    public abstract void edit();
    // impelementasi overloading pada fungsi notifikasi tambah data
    public static void tambah_pengeluaran(String jenis, int jumlah){
        System.out.println("berhasil menambah data pengeluaran "+jenis+" dengan jumlah : Rp " + jumlah);
    }
    public static void tambah_pengeluaran(int jumlah){
        System.out.println("berhasil menambah data pengeluaran dengan jumlah : Rp " + jumlah);
    }
    // impelementasi overloading pada fungsi notifikasi hapus data
    public static void hapus_pengeluaran(String jenis, int jumlah){
        System.out.println("berhasil megnhapus data pengeluaran "+jenis+" dengan jumlah jumlah pengeluaran : Rp " + jumlah);
    }
    public static void hapus_pengeluaran(int jumlah){
        System.out.println("berhasil menghapus data pengeluaran dengan jumlah jumlah pengeluaran : Rp " + jumlah);
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

    // public void setNamaItem(String nama_item, int jumlah, int index) {
    //     this.nama_item[index] = nama_item;
    //     this.jumlah[index] = jumlah;
    //     this.index = index;
    // }
    // public void setNamaItem( String nama_item ) {
    //     this.nama_item[index] = nama_item;
    // }

    // public int[] getJumlah() {
    //     return jumlah;
    // }
    // public String[] getnama_item() {
    //     return nama_item;
    // }
}
