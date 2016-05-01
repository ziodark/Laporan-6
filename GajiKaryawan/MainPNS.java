package GajiKaryawan;
import java.util.*;
public class MainPNS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner nama = new Scanner(System.in);
        int j;
        EMPLOYEE E = new EMPLOYEE();
        Manager M = new Manager();
        Pegawai_tetap PT = new Pegawai_tetap();
        Pegawai_tidakTetap PTT = new Pegawai_tidakTetap();
        System.out.println("=============Program Gaji Karyawan===============");
        do{
        System.out.println("  ===================Jabatan===================");
            System.out.println("1. Manager");
            System.out.println("2. Pegawai tetap");
            System.out.println("3. Pegawai honorer");
            System.out.println("4. Keluar Program");
            System.out.print("Masukan jabatan : ");
            j = input.nextInt();
            System.out.println(" ");
            switch(j){
                case 1 :
                    M.setJabatan("Manager");
                    System.out.println(M.getJabatan());
                    System.out.print("Masukan nama : ");
                    String p = nama.nextLine();
                    M.setNama(p);
                    System.out.print("Masukan ID   : ");
                    int id = input.nextInt();
                    M.setID(id);
                    System.out.print("Masukan Lama kerja (dalam tahun) : ");
                    int lk = input.nextInt();
                    M.setLamakerja(lk);
                    System.out.println("1. Sudah menikah / 2. Belum menikah");
                    System.out.println("Pilihan : (1/2)");
                    int i = input.nextInt();
                    M.setIstri(i);
                    System.out.print("Jumlah anak : ");
                    int a = input.nextInt();
                    M.setAnak(a);
                    M.display();
                    break;
                case 2 :
                    PT.setJabatan("Karyawan tetap");
                    System.out.println(PT.getJabatan());
                    System.out.print("Masukan nama : ");
                    String q = nama.nextLine();
                    PT.setNama(q);
                    System.out.print("Masukan ID   : ");
                    int m = input.nextInt();
                    PT.setID(m);
                    System.out.print("Masukan Lama kerja (dalam tahun) : ");
                    int l = input.nextInt();
                    PT.setLamakerja(l);
                    System.out.println("1. Sudah menikah / 2. Belum menikah");
                    System.out.println("Pilihan : (1/2)");
                    int s = input.nextInt();
                    PT.setIstri(s);
                    System.out.print("Jumlah anak : ");
                    int b = input.nextInt();
                    PT.setAnak(b);
                    PT.display();
                    break;
                case 3 :
                    PTT.setJabatan("Karyawan honorer");
                    System.out.println(PTT.getJabatan());
                    System.out.print("Masukan nama : ");
                    String r = nama.nextLine();
                    PTT.setNama(r);
                    System.out.print("Masukan ID   : ");
                    int n = input.nextInt();
                    PTT.setID(n);
                    System.out.print("Masukan lama jam kerja (Perharinya) : "); 
                    long k = input.nextInt();
                    PTT.setJamKerja(k);
                    PTT.display();
                    break;
                case 4 :
                    System.out.println("=============Terima kasih atas kerjasamanya===============");
                    break;
            }
        }
        while(j>0 && j!=4);
    }
    
}