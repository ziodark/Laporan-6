/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GajiKaryawan;

/**
 *
 * @author USER
 */
public class Pegawai_tidakTetap extends EMPLOYEE{
    private long jamKerja;
    private long lembur;
    private long gaji;
    private long gajiTotal;
    
    public Pegawai_tidakTetap(String n, String j, int id) {
        super(n, j, id);
    }
    public Pegawai_tidakTetap(){
        gaji = 2500000;
    }
    public void setJamKerja(long jk){
        jamKerja = jk;
    }
    public long getJamKerja(){
        return jamKerja;
    }
    public long getLembur(){
        if(getJamKerja()>10){
        lembur = getJamKerja() * 10000;
        }
        else{
            lembur=0;
        }
        return lembur;
    }
        public double getGajiTotal(){
            gajiTotal = gaji + getLembur();
        return gajiTotal;
        }
    
        public void display(){
        System.out.println("Nama pegawai        : "+getNama());
        System.out.println("ID pegawai          : "+getID());
        System.out.println("Jabatan             : "+getJabatan());
        System.out.println("Gaji bersih         : Rp."+gaji);
        System.out.println("Lembur              : Rp."+getLembur());
        System.out.println("Gaji Total          : Rp."+getGajiTotal());
    }
    
}
