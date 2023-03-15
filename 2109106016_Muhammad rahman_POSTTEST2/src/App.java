import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;;

 public class App {
   static ArrayList<pengeluaran>pengeluaran = new ArrayList<pengeluaran>();
   static ArrayList<pemasukan> pemasukan = new ArrayList<pemasukan>();
   static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        pemasukan pemasukan1 = new pemasukan(100000, 100000,5 , 3, 2023);pemasukan.add(0, pemasukan1);
        pengeluaran pgl1 = new pengeluaran(1, 8, 2023, 100000);pengeluaran.add(0, pgl1);
        pengeluaran pgl2 = new pengeluaran(2, 8, 2023, 50000);pengeluaran.add(1, pgl2);

        boolean ulang = true;
        int pilih,pilih2;

        while(ulang == true){
            ngapusi();
            System.out.println("APLIKASI MENGHITUNG PENGELUARAN");
            System.out.print("silahkan memilih fitur\n1.pengeluaran\n2.pemasukan\n3.keluar\npilih : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    ngapusi();
                    System.out.println("pilih fitur\n1.lihat pengeluaran\n2.tambah daftar pengeluaran\n3.hapus daftar pengeluaran\n4.update daftar pengeluaran\n5.hapus");
                    
                    pilih2 = in.nextInt();
                    
                    switch (pilih2) {
                        case 1:
                            lihat_pengeluaran();
                            break;
                        case 2:
                            // Thread.sleep(2000);
                            tambah_pengeluaran();
                        
                            break;
                        case 3:
                            hapus_pengeluaran();
                              break;
                        case 4:
                            edit();
                             break;
                        case 5:
                            System.out.println("hemat pangkal kaya!!");
                            System.exit(pilih2);
                             break;
                    
                        default:
                        System.out.println("inputan anda");
                            break;
                    }
                    break;
                case 2:
                ngapusi();
                System.out.println("pilih fitur\n1.lihat history pemasukan\n2.tambah daftar pemasukan\n3.hapus daftar pemasukan\n4.ubah data daftar pemasukan\n5.hapus");
                int pilih_pemasukan = in.nextInt();
                switch(pilih_pemasukan){
                    case 1:
                        ngapusi();
                        lihat_pemasukan();
                    break;
                    case 2:
                        ngapusi();
                        tambah_pemasukan();
                    break;
                    case 3:
                        ngapusi();
                        hapus_pemasukan();
                    break;
                    case 4:
                        ngapusi();
                        edit_pemasukan();
                    break;
                    case 5:
                        ngapusi();
                        System.exit(pilih_pemasukan);
                    break;
                }
                    break;
                
                case 3:
                    ngapusi();
                    ulang = false;
                    System.out.println("anda berhasil keluar");
                    break;
                default:
                    System.out.println("inputan anda salah, silahkan memasukan inputan yang benar");
                    break;

            }
        }
    }

    // ============================== pemasukan area ==================================
    static void lihat_pemasukan(){
        for(int i=0; i<pemasukan.size();i++){
            System.out.print("\n\nDAFTAR URUT KE ["+(i+1)+"]");
            System.out.print("\ntanggal : " + pemasukan.get(i).getTanggal());
            System.out.print("\nbulan : " + pemasukan.get(i).getBulan());
            System.out.print("\ntahun : " + pemasukan.get(i).getTahun());
            System.out.print("\npemasukan baru : " + pemasukan.get(i).getBulan());
            System.out.print("\nuang skearang : " + pemasukan.get(i).getUang_sekarang());
        }
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    static void tambah_pemasukan(){
        int tgl,bln,thn,pmsk;
        System.out.print("tanggal : ");tgl = in.nextInt();
        System.out.print("bulan : ");bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pemasukan : ");pmsk = in.nextInt();
        int uang_sekarang = pemasukan.get(pemasukan.size()-1).getUang_sekarang() + pmsk;
        int daftar = pemasukan.size();
        pemasukan pemasukan_add = new pemasukan();
        pemasukan.add(daftar, pemasukan_add);
        pemasukan.get(daftar).setUang_masuk(pmsk);
        pemasukan.get(daftar).setUang_sekarang(uang_sekarang);
        pemasukan.get(daftar).setTanggal(tgl);
        pemasukan.get(daftar).setBulan(bln);
        pemasukan.get(daftar).setTahun(thn);
        ngapusi();
        // pemasukan pemasukan_new = new pemasukan(pmsk,uang_sekarang, tgl, bln, thn);
        // pemasukan.add(pemasukan.size(), pemasukan_new);
        System.out.println("berhasil menambah data pemasukan");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    static void edit_pemasukan(){
        int tgl,bln,thn,pmsk,uang_masuk,uang_sekarang;
        System.out.println("HANYA DAPAT MENGUBAH DATA DI DAFTAR TERAKHIR");

        System.out.print("\ntanggal : " + pemasukan.get(pemasukan.size()-1).getTanggal());
        System.out.print("\nbulan : " + pemasukan.get(pemasukan.size()-1).getBulan());
        System.out.print("\ntahun : " + pemasukan.get(pemasukan.size()-1).getTahun());
        System.out.print("\npemasukan baru : " + pemasukan.get(pemasukan.size()-1).getUang_masuk());
        System.out.print("\nuang skearang : " + pemasukan.get(pemasukan.size()-1).getUang_sekarang());
        
        System.out.print("\n\nbagian ubah data");
        System.out.print("\ntanggal : "); tgl = in.nextInt();
        System.out.print("bulan : "); bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pemasukan baru : ");uang_masuk = in.nextInt();
        System.out.print("uang skearang : ");uang_sekarang = in.nextInt();
        int daftar = pemasukan.size()-1;
        // pemasukan pemasukan_edit = new pemasukan();
        // pemasukan.add(pemasukan.size()-1, pemasukan_edit);
        pemasukan.get(daftar).setUang_masuk(0);
        pemasukan.get(daftar).setUang_sekarang(uang_sekarang);
        pemasukan.get(daftar).setTanggal(tgl);
        pemasukan.get(daftar).setBulan(bln);
        pemasukan.get(daftar).setTahun(thn);
        // pemasukan.remove(pemasukan.size()-1);
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    public static void hapus_pemasukan(){
        ngapusi();
        int daftar_hapus;
        for(int i = 0; i >= 0  && i < pemasukan.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PEMASUKAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pemasukan.get(i).getTanggal()+"\nbulan : "+pemasukan.get(i).getBulan()+"\ntahun : "+pemasukan.get(i).getTahun()+"\npemasukan : "+pemasukan.get(i).getUang_masuk()+"\n");
        }
        System.out.println("menghapus daftar ke : ");
        daftar_hapus = in.nextInt();
        pemasukan.remove(daftar_hapus-1);
        System.out.println("daftar pengeluaran berhasil dihapus");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }








    // =================== pengeluaran area =================================

    public static void tambah_pengeluaran() throws Exception{
        ngapusi();
        int urut_pengeluaran = pengeluaran.size();        
        int urut_pemasukan = pemasukan.size();

        int tgl,bln,thn,pgl;
        System.out.print("masukan tanggal : ");
        tgl = in.nextInt();
        System.out.print("masukan bulan : ");
        bln = in.nextInt();
        System.out.print("masukan tahun : ");
        thn = in.nextInt();
        System.out.print("masukan total pengeluaran : ");
        pgl = in.nextInt();
        int sisa = pemasukan.get(pemasukan.size()-1).getUang_sekarang() - pgl;
        pengeluaran pengeluaran_add = new pengeluaran();
        pemasukan pemasukan_update = new pemasukan();
        int daftar_pengeluaran = pengeluaran.size();pengeluaran.add(daftar_pengeluaran, pengeluaran_add);
        int daftar_pemasukan   = pemasukan.size();pemasukan.add(daftar_pemasukan, pemasukan_update);

        pengeluaran.get(daftar_pengeluaran).setTanggal(tgl);
        pengeluaran.get(daftar_pengeluaran).setBulan(bln);
        pengeluaran.get(daftar_pengeluaran).setTahun(thn);
        pengeluaran.get(daftar_pengeluaran).setPengeluaran(pgl);

        pemasukan.get(daftar_pemasukan).setUang_masuk(0);
        pemasukan.get(daftar_pemasukan).setUang_sekarang(sisa);
        pemasukan.get(daftar_pemasukan).setTanggal(tgl);
        pemasukan.get(daftar_pemasukan).setBulan(bln);
        pemasukan.get(daftar_pemasukan).setTahun(thn);


        System.out.println("pengeluaran : " + pengeluaran.get(daftar_pengeluaran).getPengeluaran());
        System.out.println("sisa uang : "+pemasukan.get(urut_pemasukan).getUang_sekarang());
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

    }
    public static void lihat_pengeluaran(){
        ngapusi();
        System.out.println("HISTORY PENGELUARAN");
        int batas = pengeluaran.size();

        for(int i = 0; i < batas ; i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pengeluaran.get(i).getTanggal()+"\nbulan : "+pengeluaran.get(i).getBulan()+"\ntahun : "+pengeluaran.get(i).getTahun()+"\npengeluaran : "+pengeluaran.get(i).getPengeluaran());
        }

        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();


    }
    public static void edit(){
        ngapusi();
        int tgl,bln,thn,pgl;
        System.out.println("HISTORY PENGELUARAN");
        lihat_pengeluaran();
        System.out.println("edit daftar ke : ");
        int pilih3 = in.nextInt();
        
        System.out.print("tanggal : "); tgl = in.nextInt();
        System.out.print("bulan : ");bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pengeluaran : ");pgl = in.nextInt();
        int daftar = pengeluaran.size();
        pengeluaran pengeluaran_edit = new pengeluaran();
        pengeluaran.add(daftar, pengeluaran_edit);

        pengeluaran.get(daftar).setTanggal(tgl);
        pengeluaran.get(daftar).setBulan(bln);
        pengeluaran.get(daftar).setTahun(thn);
        pengeluaran.get(daftar).setPengeluaran(pgl);

        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

    }
    public static void hapus_pengeluaran(){
        ngapusi();
        int daftar_hapus;
        for(int i = 0; i >= 0  && i < pengeluaran.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+i+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pengeluaran.get(i).getTanggal()+"\nbulan : "+pengeluaran.get(i).getBulan()+"\ntahun : "+pengeluaran.get(i).getTahun()+"\npengeluaran : "+pengeluaran.get(i).getPengeluaran()+"\n");
        }
        System.out.println("menghapus daftar ke : ");
        daftar_hapus = in.nextInt();
        pengeluaran.remove(daftar_hapus-1);
        System.out.println("daftar pengeluaran berhasil dihapus");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }

    public static void ngapusi() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
