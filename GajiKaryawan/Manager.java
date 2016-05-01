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
public class Manager extends EMPLOYEE{
    private int lamaKerja, istri, anak;
    private long gaji;
    private long gajiTotal;
    private long bonus;
    private long tunjangan;
    private long TJ;
    public Manager(String n, String j, int id) {
        super(n, j, id);
        
    }
    public Manager(){
        gaji = 5000000;
    }
    
    public void setIstri(int i){
        istri = i;
    }
    public int getIstri(){
        return istri;
    }
    public void setAnak(int a){
        anak = a;
    }
    public int getAnak(){
        return anak;
    }
    public void setLamakerja(int lk){
        lamaKerja = lk;
    }
    public int getLamakerja(){
        return lamaKerja;
    }
    public long getGaji(){
        return gaji;
    }
    public long getBonus(){
        if(getLamakerja()>5){
            bonus = (long) ((long) (getLamakerja()) * (0.05*gaji));
            
            if(getLamakerja()>10){
                bonus = (long) ((long) (getLamakerja()) * (0.1*gaji));
                }
        }
            else{
                    bonus = 0;
                    }
        
        return bonus;
    }
    public long getTunjangan(){
        if(getLamakerja()>10){
            tunjangan = (long) (0.1*gaji);
            if(getIstri()==1){
                tunjangan = (long) (0.1*gaji);
            }
            if(getAnak()<=3){
                tunjangan = (long) (0.15*gaji);
            }
        }
        else{
            tunjangan=0;
}
        return tunjangan;
    }
    public long getT_Jabatan(){
        TJ += (getGaji()*0.1)* getLamakerja();
        return TJ;
    }
    public long getGajiTotal(){
        if(getLamakerja()>5){
            gajiTotal = (getGaji()*getBonus());
            if(getLamakerja()>10){
                gajiTotal +=getTunjangan();
            }
        }
        else{
            gaji = 0;
        }
        return gajiTotal;
    }
    public void display(){
        System.out.println("Nama pegawai        : "+getNama());
        System.out.println("ID pegawai          : "+getID());
        System.out.println("Jabatan             : "+getJabatan());
        System.out.println("Gaji bersih         : Rp."+getGaji());
        System.out.println("Gaji Total          : Rp."+getGajiTotal());
    }
}