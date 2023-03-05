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
            System.out.print("\ntanggal : " + pemasukan.get(i).tanggal);
            System.out.print("\nbulan : " + pemasukan.get(i).bulan);
            System.out.print("\ntahun : " + pemasukan.get(i).tahun);
            System.out.print("\npemasukan baru : " + pemasukan.get(i).uang_masuk);
            System.out.print("\nuang skearang : " + pemasukan.get(i).uang_sekarang);
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
        int uang_sekarang = pemasukan.get(pemasukan.size()-1).uang_sekarang + pmsk;
        pemasukan pemasukan_new = new pemasukan(pmsk,uang_sekarang, tgl, bln, thn);
        pemasukan.add(pemasukan.size(), pemasukan_new);
        System.out.println("berhasil menambah data pemasukan");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    static void edit_pemasukan(){
        int tgl,bln,thn,pmsk,uang_masuk,uang_sekarang;
        System.out.println("HANYA DAPAT MENGUBAH DATA DI DAFTAR TERAKHIR");

        System.out.print("\ntanggal : " + pemasukan.get(pemasukan.size()-1).tanggal);
        System.out.print("\nbulan : " + pemasukan.get(pemasukan.size()-1).bulan);
        System.out.print("\ntahun : " + pemasukan.get(pemasukan.size()-1).tahun);
        System.out.print("\npemasukan baru : " + pemasukan.get(pemasukan.size()-1).uang_masuk);
        System.out.print("\nuang skearang : " + pemasukan.get(pemasukan.size()-1).uang_sekarang);
        
        System.out.print("\n\nbagian ubah data");
        System.out.print("\ntanggal : "); tgl = in.nextInt();
        System.out.print("bulan : "); bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pemasukan baru : ");uang_masuk = in.nextInt();
        System.out.print("uang skearang : ");uang_sekarang = in.nextInt();

        pemasukan pemasukan_edit = new pemasukan(uang_masuk, uang_sekarang, tgl, bln, thn);
        pemasukan.add(pemasukan.size()-1, pemasukan_edit);
        pemasukan.remove(pemasukan.size()-1);
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
            System.out.println("\ntanggal : "+pemasukan.get(i).tanggal+"\nbulan : "+pemasukan.get(i).bulan+"\ntahun : "+pemasukan.get(i).tahun+"\npemasukan : "+pemasukan.get(i).uang_masuk+"\n");
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
        int sisa = pemasukan.get(pemasukan.size()-1).uang_sekarang - pgl;

        pengeluaran input_pengeluaran = new pengeluaran(tgl, bln, thn, pgl);
        pemasukan input_pemasukan = new pemasukan(1 , sisa,tgl, bln, thn);
        pengeluaran.add(urut_pengeluaran,input_pengeluaran);
        pemasukan.add(urut_pemasukan,input_pemasukan);


        System.out.println("pengeluaran : "+pengeluaran.get(urut_pengeluaran).pengeluaran);
        System.out.println("sisa uang : "+pemasukan.get(urut_pemasukan).uang_sekarang);
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

    }
    public static void lihat_pengeluaran(){
        ngapusi();
        System.out.println("HISTORY PENGELUARAN");
        for(int i = 0; i >= 0  && i < pengeluaran.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pengeluaran.get(i).tanggal+"\nbulan : "+pengeluaran.get(i).bulan+"\ntahun : "+pengeluaran.get(i).tahun+"\npengeluaran : "+pengeluaran.get(i).pengeluaran+"\n");
        }
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

        // System.out.println("HISTORY PEmasukan");
        // for(int i = 0; i >= 0  && i < pemasukan.size(); i++){
        //     System.out.println("============================");
        //     System.out.println(" DAFTAR PENGELUARAN KE ["+i+"]");
        //     System.out.println("============================");
        //     System.out.println("\ntanggal : "+pemasukan.get(i).uang_masuk+"\nbulan : "+pemasukan.get(i).uang_sekarang);
        // }
    }
    public static void edit(){
        ngapusi();
        int tgl,bln,thn,pgl;
        System.out.println("HISTORY PENGELUARAN");
        for(int i = 0; i >= 0  && i < pengeluaran.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pengeluaran.get(i).tanggal+"\nbulan : "+pengeluaran.get(i).bulan+"\ntahun : "+pengeluaran.get(i).tahun+"\npengeluaran : "+pengeluaran.get(i).pengeluaran+"\n");
        }
        System.out.println("edit daftar ke : ");
        int pilih3 = in.nextInt();
        
        System.out.print("tanggal : "); tgl = in.nextInt();
        System.out.print("bulan : ");bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pengeluaran : ");pgl = in.nextInt();

        pengeluaran pengeluaran_edit = new pengeluaran(tgl, bln, thn, pgl);
        pengeluaran.add(pilih3,pengeluaran_edit);
        pengeluaran.remove(pilih3-1);
        pengeluaran_edit.edit();
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
            System.out.println("\ntanggal : "+pengeluaran.get(i).tanggal+"\nbulan : "+pengeluaran.get(i).bulan+"\ntahun : "+pengeluaran.get(i).tahun+"\npengeluaran : "+pengeluaran.get(i).pengeluaran+"\n");
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
