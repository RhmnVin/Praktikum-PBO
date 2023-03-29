public class pengeluaran_bulanan extends pengeluaran{

    // penggunaan overide untuk menulis ulang isi dari method edit 
    @Override
    public void edit(){
        System.out.println("berhasil mengubah data pengeluaran bulanan");
    }

    public pengeluaran_bulanan(int tgl, int bln, int thn, int pengeluaran) {
        super(tgl, bln, thn, pengeluaran);    
        System.out.println("berhasil menambahkan data");
    }
    public pengeluaran_bulanan(){}

    
}
