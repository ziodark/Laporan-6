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
public class EMPLOYEE {
    private String nama;
    private String jabatan;
    private int ID;
    public EMPLOYEE(String n, String j, int id){
        nama = n;
        jabatan = j;
        ID = id;
    }
    public EMPLOYEE(){
        nama =" ";
        jabatan =" ";
        ID = 000000;
    }
    
    public void setNama(String n){
        nama = n;
    }
    public String getNama(){
        return nama;
    }
    public void setID(int id){
        ID = id;
    }
    public int getID(){
        return ID;
    }
    public void setJabatan(String j){
        jabatan = j;
    }
    public String getJabatan(){
        return jabatan;
    }
}
