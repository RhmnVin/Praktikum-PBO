public class pengeluaran_beasiswa extends pengeluaran{
    private String nama_beasiswa;
    private int current_money;
    @Override
    public void edit(){
        System.out.println("berhasil mengubah data pengeluaran beasiswa");
    }

    public pengeluaran_beasiswa(int tgl, int bln, int thn, int pengeluaran, String nama_beasiswa, int current_money) {
        super(tgl, bln, thn, pengeluaran);
        this.nama_beasiswa = nama_beasiswa;
        this.current_money = current_money;
        System.out.println("berhasil menambahkan data");

    }
    public void setUang_sekarang(int uang){
        this.current_money = uang;
    }
    public int getUang_sekarang(){
        return current_money;
    }
    public pengeluaran_beasiswa(){}

    
}
