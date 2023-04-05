public class pemasukan_bulanan extends pemasukan {
    public pemasukan_bulanan(int uang_masuk, int uang_sekarang, int tanggal, int bulan, int tahun) {
        super(uang_masuk, uang_sekarang, tanggal, bulan, tahun);
    }

    public pemasukan_bulanan() {
    }

    // penggunaan overide untuk menulis ulang isi dari method edit 
    @Override
    public  void edit(){
        System.out.println("berhasil mengubah data ");
    }
    
}
