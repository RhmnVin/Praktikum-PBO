import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;;

 public final class App {
   static final ArrayList<pengeluaran_beasiswa>p_beasiswa = new ArrayList<pengeluaran_beasiswa>();
   static final ArrayList<pengeluaran_bulanan>p_bulanan = new ArrayList<pengeluaran_bulanan>();

   static ArrayList<pemasukan_bulanan> pemasukan_bulan = new ArrayList<pemasukan_bulanan>();
   static Scanner in = new Scanner(System.in);

    public final static void main(String[] args) throws Exception {
        pemasukan_bulanan pemasukan1 = new pemasukan_bulanan(100000, 100000,5 , 3, 2023);pemasukan_bulan.add(0, pemasukan1);
        pengeluaran_beasiswa pgl_beasiswa = new pengeluaran_beasiswa(1, 8, 2023, 0,"Beasiswa bank indonesia",12000000);p_beasiswa.add(0, pgl_beasiswa);
        pengeluaran_bulanan pgl_bulanan = new pengeluaran_bulanan (2, 8, 2023, 50000);p_bulanan.add(0, pgl_bulanan);

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
                    System.out.println("pilih fitur\n1. pengeluaran_beasiswa\n2. pengeluaran bulanan");
                    pilih2 = in.nextInt();
                    
                    switch (pilih2) {
                        case 1:
                        ngapusi();
                        System.out.println("pilih fitur pengeluaran beasiswa\n1.lihat history pengeluaran\n2.tambah daftar pengeluaran\n3.hapus daftar pengeluaran\n4.ubah data daftar pengeluaran\n5.hapus");
                        pilih = in.nextInt();
                            switch(pilih){
                            case 1:
                            ngapusi();
                                lihat_pengeluaran_beasiswa();
                                break;
                            case 2:
                            ngapusi();
                                // Thread.sleep(2000);
                                tambah_pengeluaran_beasiswa();
                            
                                break;
                            case 3:
                            ngapusi();
                                hapus_pengeluaran_beasiswa();
                                break;
                            case 4:
                            ngapusi();
                                edit_beasiswa();
                                break;
                            case 5:
                            ngapusi();
                                System.out.println("hemat pangkal kaya!!");
                                System.exit(pilih2);
                                break;}
                            break;
                    case 2:
                    ngapusi();
                    System.out.println("pilih fitur pengeluaran bulanan\n1.lihat history pengeluaran\n2.tambah daftar pengeluaran\n3.hapus daftar pengeluaran\n4.ubah data daftar pengeluaran");
                    pilih = in.nextInt();
                    switch(pilih){
                        case 1:
                        ngapusi();
                        lihat_pengeluaran_bulanan();
                        break;
                        case 2:
                        ngapusi();
                            // Thread.sleep(2000);
                            tambah_pengeluaran_bulanan();
                        
                            break;
                        case 3:
                        ngapusi();
                            hapus_pengeluaran_bulanan();
                            break;
                        case 4:
                        ngapusi();
                            edit_bulanan();
                            break;
                        case 5:
                        ngapusi();
                            System.out.println("hemat pangkal kaya!!");
                            System.exit(pilih2);
                            break;
                        default:
                        ngapusi();
                            System.out.println("inputan anda");
                                break;}
                        
                        break;
                    default:
                        System.out.println("inputan anda salah");break;
                    }break; 

                case 2:
                ngapusi();
                // System.out.println("pilih fitur\n1. pengeluaran_bulanan\n2. pengeluaran bulanan");
                System.out.println("pilih fitur pemasukan bulanan\n1.lihat history pemasukan\n2.tambah daftar pemasukan\n3.hapus daftar pemasukan\n4.ubah data daftar pemasukan");
                int pilih_pemasukan = in.nextInt();
                switch(pilih_pemasukan){
                    case 1:
                        ngapusi();
                        System.out.println("history pemasukan bulanan");
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

    // ============================== pemasukan bulanan ==================================
    static void lihat_pemasukan(){
        for(int i=0; i<pemasukan_bulan.size();i++){
            System.out.println("\n\n===================================================");
            System.out.print("\nDAFTAR URUT KE ["+(i+1)+"]");
            System.out.print("\ntanggal : " + pemasukan_bulan.get(i).getTanggal());
            System.out.print("\nbulan : " + pemasukan_bulan.get(i).getBulan());
            System.out.print("\ntahun : " + pemasukan_bulan.get(i).getTahun());
            System.out.print("\npemasukan baru : " + pemasukan_bulan.get(i).getBulan());
            System.out.print("\nuang skearang : " + pemasukan_bulan.get(i).getUang_sekarang());

        }
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    static void tambah_pemasukan(){
        int tgl,bln,thn,pmsk; String yesno;
        System.out.print("tanggal : ");tgl = in.nextInt();
        System.out.print("bulan : ");bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pemasukan : ");pmsk = in.nextInt();

        int uang_sekarang = pemasukan_bulan.get(pemasukan_bulan.size()-1).getUang_sekarang() + pmsk;
        int daftar = pemasukan_bulan.size();
        pemasukan_bulanan pemasukan_add = new pemasukan_bulanan();
        pemasukan_bulan.add(daftar, pemasukan_add);
        pemasukan_bulan.get(daftar).setUang_masuk(pmsk);
        pemasukan_bulan.get(daftar).setUang_sekarang(uang_sekarang);
        pemasukan_bulan.get(daftar).setTanggal(tgl);
        pemasukan_bulan.get(daftar).setBulan(bln);
        pemasukan_bulan.get(daftar).setTahun(thn);
        ngapusi();
        // pemasukan pemasukan_new = new pemasukan(pmsk,uang_sekarang, tgl, bln, thn);
        // pemasukan_bulan.add(pemasukan_bulan.size(), pemasukan_new);
        System.out.println("berhasil menambah data pemasukan");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    static void edit_pemasukan(){
        int tgl,bln,thn,pmsk,uang_masuk,uang_sekarang;
        System.out.println("HANYA DAPAT MENGUBAH DATA DI DAFTAR TERAKHIR");

        System.out.print("\ntanggal : " + pemasukan_bulan.get(pemasukan_bulan.size()-1).getTanggal());
        System.out.print("\nbulan : " + pemasukan_bulan.get(pemasukan_bulan.size()-1).getBulan());
        System.out.print("\ntahun : " + pemasukan_bulan.get(pemasukan_bulan.size()-1).getTahun());
        System.out.print("\npemasukan baru : " + pemasukan_bulan.get(pemasukan_bulan.size()-1).getUang_masuk());
        System.out.print("\nuang skearang : " + pemasukan_bulan.get(pemasukan_bulan.size()-1).getUang_sekarang());
        
        System.out.print("\n\nbagian ubah data");
        System.out.print("\ntanggal : "); tgl = in.nextInt();
        System.out.print("bulan : "); bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pemasukan baru : ");uang_masuk = in.nextInt();
        int curent_money = pemasukan_bulan.get(pemasukan_bulan.size()-2).getUang_sekarang() + uang_masuk;
        int daftar = pemasukan_bulan.size()-1;
        // pemasukan pemasukan_edit = new pemasukan_bulanan();
        // pemasukan_bulan.add(pemasukan_bulan.size()-1, pemasukan_edit);
        pemasukan_bulan.get(daftar).setUang_masuk(uang_masuk);
        pemasukan_bulan.get(daftar).setUang_sekarang(curent_money);
        pemasukan_bulan.get(daftar).setTanggal(tgl);
        pemasukan_bulan.get(daftar).setBulan(bln);
        pemasukan_bulan.get(daftar).setTahun(thn);
        // pemasukan_bulan.remove(pemasukan_bulan.size()-1);
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }
    public static void hapus_pemasukan(){
        ngapusi();
        int daftar_hapus;
        for(int i = 0; i >= 0  && i < pemasukan_bulan.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PEMASUKAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+pemasukan_bulan.get(i).getTanggal()+"\nbulan : "+pemasukan_bulan.get(i).getBulan()+"\ntahun : "+pemasukan_bulan.get(i).getTahun()+"\npemasukan : "+pemasukan_bulan.get(i).getUang_masuk()+"\n"+"uang sekarang : "+pemasukan_bulan.get(i).getUang_sekarang());
        }
        System.out.println("menghapus daftar ke : ");
        daftar_hapus = in.nextInt();
        pemasukan_bulan.remove(daftar_hapus-1);
        System.out.println("daftar pengeluaran berhasil dihapus");
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }








    // =================== pengeluaran area <BEASISWA> =================================

    public static void tambah_pengeluaran_beasiswa(){
        ngapusi();
        int urut_pengeluaran = p_beasiswa.size();        
        int tgl,bln,thn,pgl; String yesno;int sisa;

        System.out.print("masukan tanggal : ");
        tgl = in.nextInt();
        System.out.print("masukan bulan : ");
        bln = in.nextInt();
        System.out.print("masukan tahun : ");
        thn = in.nextInt();
        System.out.print("masukan total pengeluaran : ");
        pgl = in.nextInt();
        System.out.println("tes p_beasiswa = " + p_beasiswa.size());
        if (p_beasiswa.size() <= 0) {
             sisa = 0;
        }
        else{
             sisa = p_beasiswa.get(p_beasiswa.size()-1).getUang_sekarang() - pgl;
        }
        pengeluaran_beasiswa pengeluaran_add = new pengeluaran_beasiswa();
        int daftar_pengeluaran = p_beasiswa.size();p_beasiswa.add(daftar_pengeluaran, pengeluaran_add);

        p_beasiswa.get(daftar_pengeluaran).setTanggal(tgl);
        p_beasiswa.get(daftar_pengeluaran).setBulan(bln);
        p_beasiswa.get(daftar_pengeluaran).setTahun(thn);
        p_beasiswa.get(daftar_pengeluaran).setPengeluaran(pgl);
        p_beasiswa.get(daftar_pengeluaran).setUang_sekarang(sisa);

        // System.out.print("ingin menambah list barang pengeluaran [y/n] : ");
        // yesno = in.next();
        // if( yesno.equals("y")){
        //     int index = 0;
        //     boolean lagi = true;
        //     while (lagi == true) {
        //         System.out.print("nama item : "); String nama = in.next();
        //         System.out.print("jumlah    : "); int jumlah = in.nextInt();
        //         p_beasiswa.get(daftar_pengeluaran).setNamaItem(nama,jumlah,index);
        //         index++;
        //         System.out.println("ingin menambah item lagi [y/n] : ");yesno = in.next();
        //         if(yesno.equals("y")){lagi = false;}
        //         else{break;}
        //     }else {}}
        p_beasiswa.get(daftar_pengeluaran).tambah_pengeluaran("beasiswa", pgl);
        System.out.println("sisa uang : "+p_beasiswa.get(daftar_pengeluaran).getUang_sekarang());
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

    }
    public static void lihat_pengeluaran_beasiswa(){
        ngapusi();
        System.out.println("HISTORY PENGELUARAN");
        int batas = p_beasiswa.size();

        for(int i = 0; i < batas ; i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+p_beasiswa.get(i).getTanggal()+"\nbulan : "+p_beasiswa.get(i).getBulan()+"\ntahun : "+p_beasiswa.get(i).getTahun()+"\npengeluaran : "+p_beasiswa.get(i).getPengeluaran()+"\nsisa uang : "+p_beasiswa.get(i).getUang_sekarang());

                // while (k <= p_beasiswa.get(i).index) {
                //     System.out.println("\nitem pengeluaran");
                //     System.out.println("["+(k+1+1)+"] nama   : " + p_beasiswa.get(i).getnama_item());
                //     System.out.println("["+(k+1+1)+"] jumlah : " + p_beasiswa.get(i).getJumlah()+"\n");
                //     k++;
                // }
            //     System.out.println("nah : "+p_beasiswa.get(i).index);
            }
        
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();


    }
    public static void edit_beasiswa(){
        ngapusi();
        int tgl,bln,thn,pgl,uangsekarang;
        System.out.println("HISTORY PENGELUARAN");
        lihat_pengeluaran_beasiswa();
        System.out.println("hanya dapat mengedit daftar terakhir");
        
        System.out.print("tanggal : "); tgl = in.nextInt();
        System.out.print("bulan : ");bln = in.nextInt();
        System.out.print("tahun : ");thn = in.nextInt();
        System.out.print("pengeluaran : ");pgl = in.nextInt();
        int daftar = p_beasiswa.size();
        if (p_beasiswa.size() <=1){
             uangsekarang = p_beasiswa.get(daftar-1).getUang_sekarang()-pgl;
        }
        else {
            
                 uangsekarang = p_beasiswa.get(daftar-2).getUang_sekarang()-pgl;
        }
        pengeluaran_beasiswa pengeluaran_edit = new pengeluaran_beasiswa();
        p_beasiswa.add(daftar, pengeluaran_edit);
        p_beasiswa.get(daftar-1).setTanggal(tgl);
        p_beasiswa.get(daftar-1).setBulan(bln);
        p_beasiswa.get(daftar-1).setTahun(thn);
        p_beasiswa.get(daftar-1).setPengeluaran(pgl);
        p_beasiswa.get(daftar-1).setUang_sekarang(uangsekarang);
        p_beasiswa.remove(daftar);
        p_beasiswa.get(daftar-1).edit();
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();

    }
    public static void hapus_pengeluaran_beasiswa(){
        ngapusi();
        int daftar_hapus;
        for(int i = 0; i >= 0  && i < p_beasiswa.size(); i++){
            System.out.println("============================");
            System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
            System.out.println("============================");
            System.out.println("\ntanggal : "+p_beasiswa.get(i).getTanggal()+"\nbulan : "+p_beasiswa.get(i).getBulan()+"\ntahun : "+p_beasiswa.get(i).getTahun()+"\npengeluaran : "+p_beasiswa.get(i).getPengeluaran()+"\n");
        }
        System.out.println("menghapus daftar ke : ");
        daftar_hapus = in.nextInt();
        p_beasiswa.get(daftar_hapus-1).hapus_pengeluaran("beasiswa", p_beasiswa.get(daftar_hapus-1).getPengeluaran());
        p_beasiswa.remove(daftar_hapus-1);
        System.out.println("\ninputkan sesuatu untuk lanjut");
        String pause = in.next();
    }

// =================== pengeluaran area <BULANAN> =================================

public static void tambah_pengeluaran_bulanan() throws Exception{
    ngapusi();
    int urut_pengeluaran = p_bulanan.size();        
    int urut_pemasukan = pemasukan_bulan.size();

    int tgl,bln,thn,pgl;
    System.out.print("masukan tanggal : ");
    tgl = in.nextInt();
    System.out.print("masukan bulan : ");
    bln = in.nextInt();
    System.out.print("masukan tahun : ");
    thn = in.nextInt();
    System.out.print("masukan total pengeluaran : ");
    pgl = in.nextInt();
    int sisa = pemasukan_bulan.get(pemasukan_bulan.size()-1).getUang_sekarang() - pgl;
    pengeluaran_bulanan pengeluaran_add = new pengeluaran_bulanan();
    pemasukan_bulanan pemasukan_update = new pemasukan_bulanan();
    int daftar_pengeluaran = p_bulanan.size();p_bulanan.add(daftar_pengeluaran, pengeluaran_add);
    int daftar_pemasukan   = pemasukan_bulan.size();pemasukan_bulan.add(daftar_pemasukan, pemasukan_update);

    p_bulanan.get(daftar_pengeluaran).setTanggal(tgl);
    p_bulanan.get(daftar_pengeluaran).setBulan(bln);
    p_bulanan.get(daftar_pengeluaran).setTahun(thn);
    p_bulanan.get(daftar_pengeluaran).setPengeluaran(pgl);

    pemasukan_bulan.get(daftar_pemasukan).setUang_masuk(0);
    pemasukan_bulan.get(daftar_pemasukan).setUang_sekarang(sisa);
    pemasukan_bulan.get(daftar_pemasukan).setTanggal(tgl);
    pemasukan_bulan.get(daftar_pemasukan).setBulan(bln);
    pemasukan_bulan.get(daftar_pemasukan).setTahun(thn);

    p_bulanan.get(daftar_pemasukan).tambah_pengeluaran("bulanan", pgl);
    System.out.println("sisa uang : "+pemasukan_bulan.get(urut_pemasukan).getUang_sekarang());
    System.out.println("\ninputkan sesuatu untuk lanjut");
    String pause = in.next();

}
public static void lihat_pengeluaran_bulanan(){
    ngapusi();
    System.out.println("HISTORY PENGELUARAN");
    int batas = p_bulanan.size();

    for(int i = 0; i < batas ; i++){
        System.out.println("============================");
        System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
        System.out.println("============================");
        System.out.println("\ntanggal : "+p_bulanan.get(i).getTanggal()+"\nbulan : "+p_bulanan.get(i).getBulan()+"\ntahun : "+p_bulanan.get(i).getTahun()+"\npengeluaran : "+p_bulanan.get(i).getPengeluaran());
    }

    System.out.println("\ninputkan sesuatu untuk lanjut");
    String pause = in.next();


}
public static void edit_bulanan(){
    ngapusi();
    int tgl,bln,thn,pgl,uangsekarang;
    System.out.println("HISTORY PENGELUARAN");
    lihat_pengeluaran_bulanan();
    System.out.println("hanya dapat mengubah daftar terakhir");
    
    System.out.print("tanggal : "); tgl = in.nextInt();
    System.out.print("bulan : ");bln = in.nextInt();
    System.out.print("tahun : ");thn = in.nextInt();
    System.out.print("pengeluaran : ");pgl = in.nextInt();
    int daftar = p_bulanan.size();
    if (pemasukan_bulan.size() <=1){
        uangsekarang = pemasukan_bulan.get(daftar-1).getUang_sekarang()-pgl;
   }
   else {
        uangsekarang = pemasukan_bulan.get(daftar-2).getUang_sekarang()-pgl;
   }
    pengeluaran_bulanan pengeluaran_edit = new pengeluaran_bulanan();
    p_bulanan.add(daftar, pengeluaran_edit);
    pengeluaran_edit.edit();
    p_bulanan.get(daftar-1).setTanggal(tgl);
    p_bulanan.get(daftar-1).setBulan(bln);
    p_bulanan.get(daftar-1).setTahun(thn);
    p_bulanan.get(daftar-1).setPengeluaran(pgl);
    pemasukan_bulan.get(daftar-1).setUang_sekarang(uangsekarang);
    p_bulanan.remove(daftar);

    System.out.println("\ninputkan sesuatu untuk lanjut");
    String pause = in.next();

}
public static void hapus_pengeluaran_bulanan(){
    ngapusi();
    int daftar_hapus;
    for(int i = 0; i >= 0  && i < p_bulanan.size(); i++){
        System.out.println("============================");
        System.out.println(" DAFTAR PENGELUARAN KE ["+(i+1)+"]");
        System.out.println("============================");
        System.out.println("\ntanggal : "+p_bulanan.get(i).getTanggal()+"\nbulan : "+p_bulanan.get(i).getBulan()+"\ntahun : "+p_bulanan.get(i).getTahun()+"\npengeluaran : "+p_bulanan.get(i).getPengeluaran()+"\n");
    }
    System.out.println("menghapus daftar ke : ");
    daftar_hapus = in.nextInt();
    p_bulanan.get(daftar_hapus-1).hapus_pengeluaran("bulanan", p_bulanan.get(daftar_hapus-1).getPengeluaran());
    p_bulanan.remove(daftar_hapus-1);
    System.out.println("\ninputkan sesuatu untuk lanjut");
    String pause = in.next();}

public static void ngapusi() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
} }

